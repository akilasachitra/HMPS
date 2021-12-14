package com.hmps.hmps.general;

import javafx.fxml.*;
import javafx.scene.Node;
import javafx.scene.control.Button;
import javafx.scene.layout.Pane;

import java.io.IOException;
import java.util.Objects;

public class Main {

    public Pane mainPane;
    public Button patientButton;
    public Button patientVisitButton;

    @FXML
    protected void onPatientButtonClick() throws IOException {
        if (!isScreenLoaded(Screens.PATIENT_REGISTRATION_ID)) {
            showScreen(Screens.PATIENT_REGISTRATION_ID, Screens.PATIENT_REGISTRATION_FXML);
        }
    }

    @FXML
    protected void onVisitButtonClick() throws IOException {
        if (!isScreenLoaded(Screens.PATIENT_VISITS_ID)) {
            showScreen(Screens.PATIENT_REGISTRATION_ID, Screens.PATIENT_VISITS_FXML);
        }
    }

    /**
     * Check if given screen is already loaded and showing in the scene
     *
     * @param screenID
     * @return
     */
    private boolean isScreenLoaded(String screenID) {
        boolean screenLoaded = false;
        for (Node node : mainPane.getChildren()) {
            if (node.getId().equals(screenID)) {
                screenLoaded = true;
                System.out.println(screenID + " already loaded");
            }
        }
        return screenLoaded;
    }


    /**
     * Purpose is to load and show given screen by id and fxml name
     *
     * @param screenID
     * @param screenFxml
     * @throws IOException
     */
    private void showScreen(String screenID, String screenFxml) throws IOException {
        if (isScreenLoaded(Screens.PATIENT_REGISTRATION_ID)) {
            System.err.println(screenFxml + " already opened");
            return;
        }
        Pane newLoadedPane = FXMLLoader.load(Objects.requireNonNull(Start.class.getResource(screenFxml)));
        newLoadedPane.setId(screenID);
        mainPane.getChildren().add(newLoadedPane);
        System.out.println(screenFxml + " opened");
    }


}
