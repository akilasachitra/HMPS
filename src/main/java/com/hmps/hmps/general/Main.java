package com.hmps.hmps.general;

import javafx.animation.Interpolator;
import javafx.animation.KeyFrame;
import javafx.animation.KeyValue;
import javafx.animation.Timeline;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.control.Button;
import javafx.scene.layout.Pane;
import javafx.util.Duration;

import java.io.IOException;

public class Main {

    public Pane mainPane;
    public Button patientButton;

    @FXML
    protected void onPatientButtonClick() throws IOException {
        boolean found = false;
        for (Node node : mainPane.getChildren()) {
            if (node.getId().equals("7588")) { // todo constants
                found = true;
                System.out.println("already opened");
            }
        }
        if (!found) {

            Pane newLoadedPane = FXMLLoader.load(Start.class.getResource("patientDetail.fxml"));
            newLoadedPane.setId("7588");
            mainPane.getChildren().add(newLoadedPane);
            //Create new TimeLine animation
            Timeline timeline = new Timeline();
            //Animate Y property
            KeyValue kv = new KeyValue(newLoadedPane.translateYProperty(), 0, Interpolator.EASE_IN);
            KeyFrame kf = new KeyFrame(Duration.millis(2000), kv);
            timeline.getKeyFrames().add(kf);
            //After completing animation, remove first scene
            timeline.setOnFinished(t -> {
                // mainPane.getChildren().remove(newLoadedPane);
            });
            timeline.play();
            System.out.println("patientDetail opened");

        }
    }

}
