package com.hmps.hmps.dtos;

import java.io.Serializable;

/**
 * Base calls for both patient and medical professional which both shares common attributes
 */
public abstract class PersonDTO implements Serializable {

    private long Id;
    private String code;
    private String fName; // First name
    private String lName; // Last name
    private String mName; // Maiden name
    private String sName; // Sur name
    private ContactDTO contact;
    private long personImageID;

    public long getId() {
        return Id;
    }

    public void setId(long id) {
        Id = id;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getFirstName() {
        return fName;
    }

    public void setFirstName(String fName) {
        this.fName = fName;
    }

    public String getLastName() {
        return lName;
    }

    public void setLastName(String lName) {
        this.lName = lName;
    }

    public String getMaidenName() {
        return mName;
    }

    public void setMaidenName(String mName) {
        this.mName = mName;
    }

    public String getSurName() {
        return sName;
    }

    public void setSurName(String sName) {
        this.sName = sName;
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
