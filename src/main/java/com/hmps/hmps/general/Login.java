package com.hmps.hmps.general;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.stage.Stage;

import java.io.IOException;

public class Login {

    @FXML
    Button loginBtn;
    @FXML
    Button registerBtn;

    @FXML
    protected void onLoginButtonClick() throws IOException {
        Parent root;
        try {
            FXMLLoader fxmlLoader = new FXMLLoader(Start.class.getResource("main.fxml"));
            Scene scene = new Scene(fxmlLoader.load(), 1280, 700);
            Stage stage = new Stage();
            stage.setTitle("HPMS 1.0");
            stage.setScene(scene);
            loginBtn.getScene().getWindow().hide();
            stage.show();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    @FXML
    protected void onRegisterButtonClick() throws IOException {
        Alert alert = new Alert(Alert.AlertType.INFORMATION);
        alert.setTitle("Register new user");
        alert.setHeaderText("Authorised access needed");
        Label label = new Label("Please contact your system administrator to create user account and assign user roles");
        label.setWrapText(true);
        alert.getDialogPane().setContent(label);
        alert.show();
    }



}
