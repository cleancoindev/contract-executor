package com.credits.wallet.desktop.controller;


import com.credits.client.node.thrift.call.ThriftCallThread.Callback;
import com.credits.general.exception.CreditsException;
import com.credits.general.pojo.ApiResponseData;
import com.credits.general.util.Converter;
import com.credits.wallet.desktop.AppState;
import com.credits.wallet.desktop.VistaNavigator;
import com.credits.wallet.desktop.utils.CoinsUtils;
import com.credits.wallet.desktop.utils.FormUtils;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.TextField;
import javafx.scene.layout.BorderPane;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.net.URL;
import java.util.ResourceBundle;

import static com.credits.wallet.desktop.AppState.NODE_ERROR;
import static com.credits.wallet.desktop.AppState.amount;
import static com.credits.wallet.desktop.AppState.coin;
import static com.credits.wallet.desktop.AppState.contractInteractionService;
import static com.credits.wallet.desktop.AppState.noClearForm6;
import static com.credits.wallet.desktop.AppState.text;
import static com.credits.wallet.desktop.utils.ApiUtils.callCreateTransaction;

/**
 * Created by Rustem.Saidaliyev on 26.01.2018.
 */
public class GenerateTransactionController implements Initializable {
    private final static Logger LOGGER = LoggerFactory.getLogger(GenerateTransactionController.class);
    private final static String CreditsSymbol = "CS";

    @FXML
    BorderPane bp;

    @FXML
    private TextField toAddress;

    @FXML TextField transactionData;

    @FXML
    private TextField amountInCs;

    @FXML
    private TextField transactionFeeValue;

    @FXML
    private void handleBack() {
        noClearForm6 = true;
        VistaNavigator.loadVista(VistaNavigator.WALLET);
    }

    @FXML
    private void handleGenerate() {
        try {
            String coin = AppState.coin;
            if(coin.equals(CreditsSymbol)) {
                callCreateTransaction(processTransactionResult());
            } else if (CoinsUtils.getCoins().get(coin)!= null) {
                contractInteractionService.transferTo(CoinsUtils.getCoins().get(coin), AppState.toAddress, amount, processTransferTokenResult());
            }
        } catch (CreditsException e) {
            LOGGER.error(NODE_ERROR + ": " + e.getMessage(), e);
            FormUtils.showError(NODE_ERROR);
            return;
        }

        VistaNavigator.loadVista(VistaNavigator.WALLET);
    }

    private Callback<String> processTransferTokenResult() {
        return new Callback<String>() {
            @Override
            public void onSuccess(String message) throws CreditsException {
                FormUtils.showPlatformInfo(message);
            }

            @Override
            public void onError(Throwable e) {
                FormUtils.showPlatformError(e.getLocalizedMessage());
            }
        };
    }

    private Callback<ApiResponseData> processTransactionResult() {
        return new Callback<ApiResponseData>() {
        @Override
        public void onSuccess(ApiResponseData response) {
            FormUtils.showPlatformInfo("Execute transaction was success");
        }

        @Override
        public void onError(Throwable e) {
            FormUtils.showPlatformError(e.getMessage());
        }
    };
    }

    @Override
    public void initialize(URL location, ResourceBundle resources) {
        FormUtils.resizeForm(bp);
        this.toAddress.setText(AppState.toAddress);
        this.amountInCs.setText(Converter.toString(amount) + " " + coin);
        this.transactionData.setText(text);
    }

}