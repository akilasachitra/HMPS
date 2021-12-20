package com.hmps.hmps.dtos;

import com.hmps.hmps.hardcodedtypes.*;

/**
 * builder class for PatientDTOBuilder
 */
public final class PatientDTOBuilder {
    private String hisCode; // Harmonized identification System code
    private String ssCode; // Social Security code
    private Gender gender;
    private BloodGroup bloodGroup;
    private MaritalStatus maritalStatus;
    private Country country;
    private int nationality;
    private Language language;
    private long Id;
    private String code;
    private String firstName; // First name
    private String lastName; // Last name
    private String maidenName; // Maiden name
    private String surName; // Sur name
    private ContactDTO contact;
    private long personImageID;

    private PatientDTOBuilder() {
    }

    public static PatientDTOBuilder getInstance() {
        return new PatientDTOBuilder();
    }

    public PatientDTOBuilder setHisCode(String hisCode) {
        this.hisCode = hisCode;
        return this;
    }

    public PatientDTOBuilder setSsCode(String ssCode) {
        this.ssCode = ssCode;
        return this;
    }

    public PatientDTOBuilder setGender(Gender gender) {
        this.gender = gender;
        return this;
    }

    public PatientDTOBuilder setBloodGroup(BloodGroup bloodGroup) {
        this.bloodGroup = bloodGroup;
        return this;
    }

    public PatientDTOBuilder setMaritalStatus(MaritalStatus maritalStatus) {
        this.maritalStatus = maritalStatus;
        return this;
    }

    public PatientDTOBuilder setCountry(Country country) {
        this.country = country;
        return this;
    }

    public PatientDTOBuilder setNationality(int nationality) {
        this.nationality = nationality;
        return this;
    }

    public PatientDTOBuilder setLanguage(Language language) {
        this.language = language;
        return this;
    }

    public PatientDTOBuilder setId(long Id) {
        this.Id = Id;
        return this;
    }

    public PatientDTOBuilder setCode(String code) {
        this.code = code;
        return this;
    }

    public PatientDTOBuilder setFirstName(String firstName) {
        this.firstName = firstName;
        return this;
    }

    public PatientDTOBuilder setLastName(String lastName) {
        this.lastName = lastName;
        return this;
    }

    public PatientDTOBuilder setMaidenName(String maidenName) {
        this.maidenName = maidenName;
        return this;
    }

    public PatientDTOBuilder setSurName(String surName) {
        this.surName = surName;
        return this;
    }

    public PatientDTOBuilder setContact(ContactDTO contact) {
        this.contact = contact;
        return this;
    }

    public PatientDTOBuilder setPersonImageID(long personImageID) {
        this.personImageID = personImageID;
        return this;
    }

    public PatientDTO build() {
        PatientDTO patientDTO = new PatientDTO();
        patientDTO.setHisCode(hisCode);
        patientDTO.setSsCode(ssCode);
        patientDTO.setGender(gender);
        patientDTO.setBloodGroup(bloodGroup);
        patientDTO.setMaritalStatus(maritalStatus);
        patientDTO.setCountry(country);
        patientDTO.setNationality(nationality);
        patientDTO.setLanguage(language);
        patientDTO.setId(Id);
        patientDTO.setCode(code);
        patientDTO.setFirstName(firstName);
        patientDTO.setLastName(lastName);
        patientDTO.setMaidenName(maidenName);
        patientDTO.setSurName(surName);
        patientDTO.setContact(contact);
        patientDTO.setPersonImageID(personImageID);
        return patientDTO;
    }
}
