package com.hmps.hmps.dtos;


import com.hmps.hmps.hardcodedtypes.*;
import javafx.beans.property.SimpleIntegerProperty;
import javafx.beans.property.SimpleStringProperty;

import java.util.Date;
import java.util.Random;

/**
 * Patient specific attributes goes here
 */
public class PatientDTO extends PersonDTO {

    public String hisCode; // Harmonized identification System code
    public String ssCode; // Social Security code
    public Date bDate;// Birthdate
    public Gender gender;
    public BloodGroup bloodGroup;
    public MaritalStatus maritalStatus;
    public Country country;
    public int nationality;
    public Language language;

    public String getHisCode() {
        return hisCode;
    }

    public void setHisCode(String hisCode) {
        this.hisCode = hisCode;
    }

    public String getSsCode() {
        return ssCode;
    }

    public void setSsCode(String ssCode) {
        this.ssCode = ssCode;
    }

    public Date getBirthDate() {
        return bDate;
    }

    public void setBirthDate(Date bDate) {
        this.bDate = bDate;
    }

    public Gender getGender() {
        return gender;
    }

    public void setGender(Gender gender) {
        this.gender = gender;
    }

    public BloodGroup getBloodGroup() {
        return bloodGroup;
    }

    public void setBloodGroup(BloodGroup bloodGroup) {
        this.bloodGroup = bloodGroup;
    }

    public MaritalStatus getMaritalStatus() {
        return maritalStatus;
    }

    public void setMaritalStatus(MaritalStatus maritalStatus) {
        this.maritalStatus = maritalStatus;
    }

    public Country getCountry() {
        return country;
    }

    public void setCountry(Country country) {
        this.country = country;
    }

    public int getNationality() {
        return nationality;
    }

    public void setNationality(int nationality) {
        this.nationality = nationality;
    }

    public Language getLanguage() {
        return language;
    }

    public void setLanguage(Language language) {
        this.language = language;
    }

    public SimpleIntegerProperty getAgeProperty() {
        return new SimpleIntegerProperty(new Random().nextInt(55));
    }

    public SimpleStringProperty getAddressProperty() {
        SimpleStringProperty property = new SimpleStringProperty();

        ContactDTO contact = getContact();
        if (contact != null) {
            property.set(contact.getAddress1());
        }
        return property;
    }

    public SimpleStringProperty getEmailProperty() {
        SimpleStringProperty property = new SimpleStringProperty();

        ContactDTO contact = getContact();
        if (contact != null) {
            property.set(contact.getEmail());
        }
        return property;
    }

    public SimpleStringProperty getContactNumberProperty() {
        SimpleStringProperty property = new SimpleStringProperty();
        ContactDTO contact = getContact();
        if (contact != null) {
            property.set(contact.getTelephone1());
        }
        return property;
    }


}
