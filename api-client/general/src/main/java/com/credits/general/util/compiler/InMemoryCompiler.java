package com.credits.general.util.compiler;


import com.credits.general.exception.CompilationErrorException;
import com.credits.general.exception.CompilationException;
import com.credits.general.util.compiler.model.CompilationPackage;
import com.credits.general.util.compiler.model.CompilationUnit;
import com.credits.general.util.compiler.model.JavaSourceFromString;
import com.credits.general.util.sourceCode.GeneralSourceCodeUtils;

import javax.tools.Diagnostic;
import javax.tools.DiagnosticCollector;
import javax.tools.JavaCompiler;
import javax.tools.JavaCompiler.CompilationTask;
import javax.tools.JavaFileObject;
import javax.tools.ToolProvider;
import java.io.UnsupportedEncodingException;
import java.net.URL;
import java.net.URLClassLoader;
import java.net.URLDecoder;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.regex.Pattern;

/**
 * The dynamic compiler uses the JavaCompiler with custom implementations of a JavaFileManager and
 * JavaFileObject to compile a Java Source from a String to Bytecode.
 *
 * @see InMemoryClassManager
 * @see JavaSourceFromString
 */
public class InMemoryCompiler {

	/**
	 * Compiles a single class.
	 *
	 * @param code class code
	 * @return Compilation package
	 */
	public CompilationPackage compile(String code) throws CompilationException {
		String className = GeneralSourceCodeUtils.parseClassName(code);
		JavaCompiler compiler = getSystemJavaCompiler();

		DiagnosticCollector<JavaFileObject> collector = getDiagnosticCollector();
		InMemoryClassManager manager = getClassManager(compiler);

		// defining classpath
		String classpath;
		try {
			classpath = loadClasspath();
		} catch (UnsupportedEncodingException e) {
			throw new CompilationException(e);
		}

		// add classpath to options
		List<String> options = Arrays.asList("-parameters", "-classpath", classpath);

		// java source from string
		List<JavaSourceFromString> strFiles = new ArrayList<>();
		strFiles.add(new JavaSourceFromString(className, code) );

		// compile
		CompilationTask task = compiler.getTask(null, manager, collector, options, null, strFiles);
		boolean status = task.call();

		List<CompilationUnit> compilationUnits = manager.getAllClasses();
		return new CompilationPackage(compilationUnits, collector, status);
	}

	DiagnosticCollector<JavaFileObject> getDiagnosticCollector() {
		return new DiagnosticCollector<>();
	}

	InMemoryClassManager getClassManager(JavaCompiler compiler) {
		return new InMemoryClassManager(compiler.getStandardFileManager(null, null, null));
	}

	JavaCompiler getSystemJavaCompiler() throws CompilationException {

		JavaCompiler compiler = ToolProvider.getSystemJavaCompiler();
		if (compiler == null) {
			String jdkPath = this.loadJdkPathFromEnvironmentVariables();
			System.setProperty("java.home", jdkPath);
			compiler = ToolProvider.getSystemJavaCompiler();
		}
		return compiler;
	}

	String loadJdkPathFromEnvironmentVariables() throws CompilationException {
		Pattern regexpJdkPath = Pattern.compile("jdk[\\d]\\.[\\d]\\.[\\d]([\\d._])");
		String jdkBinPath = Arrays.stream(System.getenv("Path").split(";"))
			.filter(it -> regexpJdkPath.matcher(it).find())
			.findFirst()
			.orElseThrow(() -> new CompilationException("Cannot compile the file. The java compiler has not been found, Java Development Kit should be installed."));
		return jdkBinPath.substring(0, jdkBinPath.length() - 4); // remove last 4 symbols "\bin"
	}

	String loadClasspath() throws UnsupportedEncodingException {
		StringBuilder sb = new StringBuilder();
		URLClassLoader urlClassLoader = (URLClassLoader) Thread
			.currentThread().getContextClassLoader();
		for (URL url : urlClassLoader.getURLs()) {
			sb.append(URLDecoder.decode(url.getFile(), "UTF-8")).append(
				System.getProperty("path.separator"));
		}
		return sb.toString();
	}

	public static CompilationPackage compileSourceCode(String sourceCode) throws CompilationException, CompilationErrorException {
		CompilationPackage compilationPackage = new InMemoryCompiler().compile(sourceCode);

		if (!compilationPackage.isCompilationStatusSuccess()) {
			DiagnosticCollector collector = compilationPackage.getCollector();
			List<Diagnostic> diagnostics = collector.getDiagnostics();
			List<CompilationErrorException.Error> errors = new ArrayList<>();
			diagnostics.forEach(action -> {
				CompilationErrorException.Error error = new CompilationErrorException.Error(
					action.getLineNumber(),
					action.getMessage(null)
				);
				errors.add(error);
			});
			throw new CompilationErrorException(errors);
		}
		return compilationPackage;
	}

}
