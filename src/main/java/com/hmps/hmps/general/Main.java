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
    public Button medProfButton;
    public Button opDetailButton;
    public Button opMonitorButton;
    public Button pharmacyDetailButton;
    public Button inventoryButton;
    public Button reportsButton;

    @FXML
    protected void onPatientButtonClick() throws IOException {
        showScreen(Screens.PATIENT_REGISTRATION_ID, Screens.PATIENT_REGISTRATION_FXML);
    }

    @FXML
    protected void onVisitButtonClick() throws IOException {
        showScreen(Screens.PATIENT_VISITS_ID, Screens.PATIENT_VISITS_FXML);
    }

    @FXML
    protected void onPatientMonitorButtonClick() throws IOException {
        showScreen(Screens.PATIENT_VISITS_ID, Screens.PATIENT_MONITOR_FXML);
    }

    @FXML
    protected void onMedProfButtonClick() throws IOException {
        showScreen(Screens.MED_PROF_ID, Screens.MED_PROF_FXML);
    }


    @FXML
    protected void onOpDetailButtonClick() throws IOException {
        showScreen(Screens.OP_DETAIL_ID, Screens.OP_DETAIL_FXML);
    }

    @FXML
    protected void onOpMonitorButtonClick() throws IOException {
        showScreen(Screens.OP_MONITOR_ID, Screens.OP_MONITOR_FXML);
    }

    @FXML
    protected void onPharmacyDetailButtonClick() throws IOException {
        showScreen(Screens.PHARMACY_DETAIL_ID, Screens.PHARMACY_DETAIL_FXML);
    }

    @FXML
    protected void onInventoryButtonClick() throws IOException {
        showScreen(Screens.INVENTORY_ID, Screens.INVENTORY_FXML);
    }

    @FXML
    protected void onReportsButtonClick() throws IOException {
        showScreen(Screens.REPORTS_ID, Screens.REPORTS_FXML);
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
        Pane newLoadedPane = FXMLLoader.load(Objects.requireNonNull(Start.class.getResource(screenFxml)));
        newLoadedPane.setId(screenID);
        mainPane.getChildren().setAll(newLoadedPane);
        System.out.println(screenFxml + " opened");
    }


}
