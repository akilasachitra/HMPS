package com.hmps.hmps.general;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class Start extends Application {


    @Override
    public void start(Stage stage) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(Start.class.getResource("login.fxml"));
        Scene scene = new Scene(fxmlLoader.load(), 801, 415);
        stage.setTitle("Hospital Planning and Management System (HPMS 0.1v - Akila Sachitra : 20005619)");
        stage.setResizable(false);
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }

}
