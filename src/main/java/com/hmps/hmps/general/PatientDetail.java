package com.hmps.hmps.general;

import com.hmps.hmps.dtos.ContactDTO;
import com.hmps.hmps.dtos.ContactDTOBuilder;
import com.hmps.hmps.dtos.PatientDTO;
import com.hmps.hmps.dtos.PatientDTOBuilder;
import com.hmps.hmps.hardcodedtypes.BloodGroup;
import com.hmps.hmps.hardcodedtypes.Gender;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.event.Event;
import javafx.fxml.FXML;
import javafx.scene.control.*;
import javafx.scene.control.cell.PropertyValueFactory;

public class PatientDetail {

    @javafx.fxml.FXML
    private Button cancel;
    @javafx.fxml.FXML
    private TextField textLName;
    @javafx.fxml.FXML
    private TextField textSurName;
    @javafx.fxml.FXML
    private ComboBox cmbBoxMaritalStatus;
    @javafx.fxml.FXML
    private Button save;
    @javafx.fxml.FXML
    private DatePicker dpBirthDate;
    @javafx.fxml.FXML
    private TextField textHISCode;
    @javafx.fxml.FXML
    private ComboBox cmbBoxNationality;
    @javafx.fxml.FXML
    private TextField textFax;
    @javafx.fxml.FXML
    private ComboBox cmbBoxCountry;
    @javafx.fxml.FXML
    private TextField textFName;
    @javafx.fxml.FXML
    private TextField textAddress3;
    @javafx.fxml.FXML
    private ComboBox cmbBoxLanguage;
    @javafx.fxml.FXML
    private TextField textTp2;
    @javafx.fxml.FXML
    private TextField textAddress2;
    @javafx.fxml.FXML
    private TextField textTp1;
    @javafx.fxml.FXML
    private TextField textAddress1;
    @javafx.fxml.FXML
    private TextField textEmail;
    @javafx.fxml.FXML
    private TextField textSocialSecurityCode;
    @javafx.fxml.FXML
    private ComboBox cmbBoxGender;
    @javafx.fxml.FXML
    private TextField textCode;
    @javafx.fxml.FXML
    private ComboBox cmbBoxBloodGroup;
    @javafx.fxml.FXML
    private Button newData;
    @javafx.fxml.FXML
    private CheckBox btnSearchByMaritalStatus;
    @javafx.fxml.FXML
    private CheckBox btnSearchByLanguage;
    @javafx.fxml.FXML
    private ComboBox cmbBoxSearchByGender;
    @javafx.fxml.FXML
    private CheckBox btnSearchByGender;
    @javafx.fxml.FXML
    private TextField textSearchLName;
    @javafx.fxml.FXML
    private TextField textMaidenName;
    @javafx.fxml.FXML
    private RadioButton btnSearchByAge;
    @javafx.fxml.FXML
    private RadioButton btnSearchByHISCode;
    @javafx.fxml.FXML
    private TextField textSearchMaidenName;
    @javafx.fxml.FXML
    private RadioButton btnSearchBySSCode;
    @javafx.fxml.FXML
    private TextField textSearchCode;
    @javafx.fxml.FXML
    private TextField textSearchAgeTo;
    @javafx.fxml.FXML
    private Button search;
    @javafx.fxml.FXML
    private RadioButton btnSearchByCode;
    @javafx.fxml.FXML
    private ComboBox cmbBoxSearchByBloodGroup;
    @javafx.fxml.FXML
    private TextField textSearchHISCode;
    @javafx.fxml.FXML
    private Button btnUpload;
    @javafx.fxml.FXML
    private TextField textSearchSSCode;
    @javafx.fxml.FXML
    private CheckBox btnSearchByBloodGroup;
    @javafx.fxml.FXML
    private ComboBox cmbBoxSearchByCountry;
    @javafx.fxml.FXML
    private TextField textSearchAgeFrom;
    @javafx.fxml.FXML
    private TextField textSearchSurName;
    @javafx.fxml.FXML
    private TextField textSearchFName;
    @javafx.fxml.FXML
    private CheckBox btnSearchByCountry;
    @javafx.fxml.FXML
    private ComboBox cmbBoxSearchByMaritalStatus;
    @javafx.fxml.FXML
    private ComboBox cmbBoxSearchByLanguage;
    @javafx.fxml.FXML
    private TableView<PatientDTO> tblPatientData;
    @FXML
    private TableColumn<PatientDTO, String> fNameColumn;
    @FXML
    private TableColumn<PatientDTO, String> addressColumn;
    @FXML
    private TableColumn<PatientDTO, String> contactColumn;
    @FXML
    private TableColumn<PatientDTO, Integer> ageColumn;
    @FXML
    private TableColumn<PatientDTO, Long> idColumn;
    @FXML
    private TableColumn<PatientDTO, String> bGroupColumn;
    @FXML
    private TableColumn<PatientDTO, String> lNameColumn;
    @FXML
    private TableColumn<PatientDTO, String> sexColumn;
    @FXML
    private TableColumn<PatientDTO, String> emailColumn;


    @Deprecated
    public void initialize() {
        idColumn.setCellValueFactory(new PropertyValueFactory<PatientDTO, Long>("id"));
        fNameColumn.setCellValueFactory(new PropertyValueFactory<PatientDTO, String>("firstName"));
        lNameColumn.setCellValueFactory(new PropertyValueFactory<PatientDTO, String>("lastName"));
        ageColumn.setCellValueFactory(new PropertyValueFactory<PatientDTO, Integer>("getAge"));
        sexColumn.setCellValueFactory(new PropertyValueFactory<PatientDTO, String>("gender"));
        bGroupColumn.setCellValueFactory(new PropertyValueFactory<PatientDTO, String>("bloodGroup"));
        addressColumn.setCellValueFactory(new PropertyValueFactory<PatientDTO, String>("getAddress"));
        emailColumn.setCellValueFactory(new PropertyValueFactory<PatientDTO, String>("getEmail"));
        contactColumn.setCellValueFactory(new PropertyValueFactory<PatientDTO, String>("getContactNumber"));
        tblPatientData.getItems().setAll(getExistingData());

    }


    @javafx.fxml.FXML
    public void onSave(ActionEvent actionEvent) {
    }

    @javafx.fxml.FXML
    public void onCancel(ActionEvent actionEvent) {
    }

    @javafx.fxml.FXML
    public void onNew(ActionEvent actionEvent) {
    }

    @javafx.fxml.FXML
    public void onBtnSearchByCode(ActionEvent actionEvent) {
    }

    @javafx.fxml.FXML
    public void onBtnSearchByHISCode(ActionEvent actionEvent) {
    }

    @javafx.fxml.FXML
    public void onUpload(ActionEvent actionEvent) {
    }

    @javafx.fxml.FXML
    public void onSearch(ActionEvent actionEvent) {
    }

    @javafx.fxml.FXML
    public void onBtnSearchBySSCode(ActionEvent actionEvent) {
    }

    @javafx.fxml.FXML
    public void onTablePatientDataClick(Event event) {

    }

    private ObservableList<PatientDTO> getExistingData() {
        PatientDTO patient1 = getPatientDTO(1001, "Michel", "Laurance", Gender.MALE,
                BloodGroup.AB_POSITIVE, "813 Howard Street SOUTHAMPTON ", "michel2125@icloud.com", "00194565656");
        PatientDTO patient2 = getPatientDTO(1002, "Jane", "Iorine", Gender.FEMALE,
                BloodGroup.A_POSITIVE, "71 Cherry Court Oswego", "jane88@gmail.com", "00168798797");
        PatientDTO patient3 = getPatientDTO(1003, "Stefee", "Rogan", Gender.FEMALE,
                BloodGroup.O_POSITIVE, "16/22 lafred house , jenso", "Stefeel25125@yahoo.com", "00197976778");
        PatientDTO patient4 = getPatientDTO(1004, "Jebs", "Weener", Gender.MALE,
                BloodGroup.A_NEGATIVE, "SO53 5PD Kent , ", "Jebs234232125@hotmail.com", "00194565656");
        PatientDTO patient5 = getPatientDTO(1005, "Jason", "Roy", Gender.MALE,
                BloodGroup.AB_NEGATIVE, "501a Halfway Street Sidcup ", "roytoy12334@gmail.com", "00123787577");
        PatientDTO patient6 = getPatientDTO(1006, "Fleming", "gibs", Gender.MALE,
                BloodGroup.AB_POSITIVE, "39  Flat B Acacia Avenue ", "gibs2342@live.com", "001945645646");
        PatientDTO patient7 = getPatientDTO(1007, "Jeen", "Gray", Gender.FEMALE,
                BloodGroup.O_POSITIVE, "55 North End Silhurst", "jeenl2125@icloud.com", "00194564644");
        PatientDTO patient8 = getPatientDTO(1008, "Jodi", "Foster", Gender.UNCONFIRMED,
                BloodGroup.O_NEGATIVE, "96 South End Loamshire", "fostereree@gmail.com", "00194787897");
        PatientDTO patient9 = getPatientDTO(1009, "Ricky", "Symon", Gender.UNKNOWN,
                BloodGroup.B_NEGATIVE, "39 Acacia Avenue  Silhurst ", "michel2125@gmail.com", "001456468946");
        PatientDTO patient10 = getPatientDTO(1010, "Jonny", "Cloud", Gender.MALE,
                BloodGroup.B_POSITIVE, "lane 1 , Gavic city , Oswego ", "cloud99@yahoo.com", "0017897946445");

        ObservableList<PatientDTO> list = FXCollections.observableArrayList(patient1, patient2, patient3, patient4,
                patient5, patient6, patient7, patient8, patient9, patient10);

        return list;
    }

    private PatientDTO getPatientDTO(long id, String fName, String lName, Gender gender, BloodGroup bloodGroup, String address, String email, String contactNo) {
        ContactDTO contact = ContactDTOBuilder.getInstance().setAddress1(address)
                .setEmail(email).setTelephone1(contactNo).build();

        return PatientDTOBuilder.getInstance().setId(id).setFirstName(fName)
                .setLastName(lName).setGender(gender)
                .setBloodGroup(bloodGroup).setContact(contact).build();
    }


}
