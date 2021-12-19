package com.hmps.hmps.dtos;


import com.hmps.hmps.hardcodedtypes.*;

import java.util.Date;

/**
 * Patient specific attributes goes here
 */
public class PatientDTO extends PersonDTO {

    private String hisCode; // Harmonized identification System code
    private String ssCode; // Social Security code
    private Date bDate;// Birthdate
    private Gender gender;
    private BloodGroup bloodGroup;
    private MaritalStatus maritalStatus;
    private Country country;
    private int nationality;
    private Language language;

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
}
