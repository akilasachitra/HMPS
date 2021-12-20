package com.hmps.hmps.general;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;
import java.util.Objects;

public class Start extends Application {


    @Override
    public void start(Stage stage) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(Start.class.getResource("login.fxml"));//todo
        Scene scene = new Scene(fxmlLoader.load(), 801, 415); //todo
        //FXMLLoader fxmlLoader = new FXMLLoader(Start.class.getResource("main.fxml"));
        //Scene scene = new Scene(fxmlLoader.load(), 1280, 700);
        scene.getStylesheets().add(Objects.requireNonNull(getClass().getResource("CSS/button.css")).toExternalForm());
        stage.setTitle("Hospital Planning, Management and Monitoring System (HPMS 1.0v - Akila Sachitra : 20005619)");
        stage.setResizable(false);
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }

}
