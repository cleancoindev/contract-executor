package com.credits.general.util.variant;

import com.credits.general.pojo.VariantData;
import com.credits.general.pojo.VariantType;
import com.credits.general.thrift.generated.Variant;
import com.credits.general.util.GeneralConverter;
import com.credits.general.util.exception.ConverterException;

import java.math.BigDecimal;
import java.util.*;

public class VariantConverter {

    public static Variant variantDataToVariant(VariantData variantData) {
        return new VariantDataMapper().apply(variantData)
                .orElseThrow(() -> {
                    return new IllegalArgumentException("Unsupported type of the value {" + variantData.getBoxedValue().toString() + "}: " + variantData.getVariantType().name);
                });
    }

    public static BigDecimal getBigDecimalFromVariant(Variant variant) throws ConverterException {
        VariantData variantData = variantToVariantData(variant);
        BigDecimal balance;
        VariantType variantType = variantData.getVariantType();
        Object value = variantData.getBoxedValue();
        if (variantType == VariantType.INT || variantType == VariantType.INT_BOX) {
            balance = new BigDecimal((Integer) value);
        } else if (variantType == VariantType.LONG || variantType == VariantType.LONG_BOX) {
            balance = new BigDecimal((Long) value);
        } else if (variantType == VariantType.STRING) {
            balance = new BigDecimal((String) value);
        } else if (variantType == VariantType.DOUBLE || variantType == VariantType.DOUBLE_BOX) {
            balance = new BigDecimal((Double) value);
        } else {
            throw new ConverterException("Balance type is" + variantData.getClass());
        }
        return balance;
    }

    public static VariantData variantToVariantData(Variant variant) throws ConverterException {
        VariantType variantType;
        Object boxedValue;
        if (variant.isSetV_null()) {
            variantType = VariantType.NULL;
            boxedValue = null;
        } else if (variant.isSetV_string()) {
            variantType = VariantType.STRING;
            boxedValue = variant.getV_string();
        } else if (variant.isSetV_boolean()) {
            variantType = VariantType.BOOL;
            boxedValue = variant.getV_boolean();
        } else if (variant.isSetV_boolean_box()) {
            variantType = VariantType.BOOL_BOX;
            boxedValue = variant.getV_boolean_box();

        } else if (variant.isSetV_double()) {
            variantType = VariantType.DOUBLE;
            boxedValue = variant.getV_double();
        } else if (variant.isSetV_double_box()) {
            variantType = VariantType.DOUBLE_BOX;
            boxedValue = variant.getV_double_box();

        } else if (variant.isSetV_float()) {
            variantType = VariantType.FLOAT;
            boxedValue = GeneralConverter.toFloat(variant.getV_float());
        } else if (variant.isSetV_float_box()) {
            variantType = VariantType.FLOAT_BOX;
            boxedValue = GeneralConverter.toFloat(variant.getV_float_box());

        } else if (variant.isSetV_byte()) {
            variantType = VariantType.BYTE;
            boxedValue = variant.getV_byte();
        } else if (variant.isSetV_byte_box()) {
            variantType = VariantType.BYTE_BOX;
            boxedValue = variant.getV_byte_box();

        } else if (variant.isSetV_short()) {
            variantType = VariantType.SHORT;
            boxedValue = variant.getV_short();
        } else if (variant.isSetV_short_box()) {
            variantType = VariantType.SHORT_BOX;
            boxedValue = variant.getV_short_box();

        } else if (variant.isSetV_int()) {
            variantType = VariantType.INT;
            boxedValue = variant.getV_int();
        } else if (variant.isSetV_int_box()) {
            variantType = VariantType.INT_BOX;
            boxedValue = variant.getV_int_box();

        } else if (variant.isSetV_long()) {
            variantType = VariantType.LONG;
            boxedValue = variant.getV_long();
        } else if (variant.isSetV_long_box()) {
            variantType = VariantType.LONG_BOX;
            boxedValue = variant.getV_long_box();

        } else if (variant.isSetV_list()) {
            variantType = VariantType.LIST;
            List<VariantData> variantDataList = new ArrayList<>();
            variant.getV_list().forEach(variantListElem -> {
                variantDataList.add(VariantConverter.variantToVariantData(variantListElem));
            });
            boxedValue = variantDataList;
        } else if (variant.isSetV_map()) {
            variantType = VariantType.MAP;
            Map<VariantData, VariantData> variantDataMap = new HashMap<>();
            variant.getV_map().entrySet().forEach(entry -> {
                VariantData key = VariantConverter.variantToVariantData(entry.getKey());
                VariantData value = VariantConverter.variantToVariantData(entry.getValue());
                variantDataMap.put(key, value);
            });
            boxedValue = variantDataMap;
        } else if (variant.isSetV_set()) {
            variantType = VariantType.SET;
            Set<VariantData> variantDataSet = new HashSet<>();
            variant.getV_set().forEach(variantSetElem -> {
                variantDataSet.add(VariantConverter.variantToVariantData(variantSetElem));
            });
            boxedValue = variantDataSet;
        } else if (variant.isSetV_array()) {
            variantType = VariantType.ARRAY;
            List<VariantData> variantDataList = new ArrayList<>();
            variant.getV_array().forEach(variantListElem -> {
                variantDataList.add(VariantConverter.variantToVariantData(variantListElem));
            });
            boxedValue = variantDataList.toArray(new VariantData[variantDataList.size()]);
        } else {
            throw new ConverterException("Unsupported variant type");
        }
        return new VariantData(variantType, boxedValue);
    }

    public static String variantToString(Variant variant) {
        String valueAsString;
        if (variant.isSetV_string()) {
            valueAsString = variant.getV_string();
        } else if (variant.isSetV_boolean()) {
            valueAsString = GeneralConverter.toString(variant.getV_boolean());
        } else if (variant.isSetV_boolean_box()) {
            valueAsString = GeneralConverter.toString(variant.getV_boolean_box());
        } else if (variant.isSetV_double()) {
            valueAsString = GeneralConverter.toString(variant.getV_double());
        } else if (variant.isSetV_double_box()) {
            valueAsString = GeneralConverter.toString(variant.getV_double_box());
        } else if (variant.isSetV_float()) {
            valueAsString = GeneralConverter.toString(variant.getV_float());
        } else if (variant.isSetV_float_box()) {
            valueAsString = GeneralConverter.toString(variant.getV_float_box());
        } else if (variant.isSetV_byte()) {
            valueAsString = GeneralConverter.toString(variant.getV_byte());
        } else if (variant.isSetV_byte_box()) {
            valueAsString = GeneralConverter.toString(variant.getV_byte_box());
        } else if (variant.isSetV_short()) {
            valueAsString = GeneralConverter.toString(variant.getV_short());
        } else if (variant.isSetV_short_box()) {
            valueAsString = GeneralConverter.toString(variant.getV_short_box());
        } else if (variant.isSetV_int()) {
            valueAsString = GeneralConverter.toString(variant.getV_int());
        } else if (variant.isSetV_int_box()) {
            valueAsString = GeneralConverter.toString(variant.getV_int_box());
        } else if (variant.isSetV_long()) {
            valueAsString = GeneralConverter.toString(variant.getV_long());
        } else if (variant.isSetV_long_box()) {
            valueAsString = GeneralConverter.toString(variant.getV_long_box());
        } else {
            throw new ConverterException("Unsupported variant type");
        }
        return valueAsString;
   }
}