package com.hmps.hmps.dtos;

import java.io.Serializable;

/**
 * Base calls for both patient and medical professional which both shares common attributes
 */
public abstract class PersonDTO implements Serializable {

    public long id;
    public String code;
    public String firstName; // First name
    public String lastName; // Last name
    public String maidenName; // Maiden name
    public String surName; // Sur name
    public ContactDTO contact;
    public long personImageID;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String fName) {
        this.firstName = fName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lName) {
        this.lastName = lName;
    }

    public String getMaidenName() {
        return maidenName;
    }

    public void setMaidenName(String mName) {
        this.maidenName = mName;
    }

    public String getSurName() {
        return surName;
    }

    public void setSurName(String sName) {
        this.surName = sName;
    }

    public ContactDTO getContact() {
        return contact;
    }

    public void setContact(ContactDTO contact) {
        this.contact = contact;
    }

    public long getPersonImageID() {
        return personImageID;
    }

    public void setPersonImageID(long personImageID) {
        this.personImageID = personImageID;
    }
}
