package com.hmps.hmps.dtos;

import com.hmps.hmps.hardcodedtypes.MedProfType;

/**
 * Medical professional specific attributes goes here
 */
public class MedicalProfDTO extends PersonDTO {

    private String salutation;
    private String title;
    private MedProfType type;
    private long disciplineID;
    private String registrationCode;
    private String internalCode;
    private long wardID;

    public String getSalutation() {
        return salutation;
    }

    public void setSalutation(String salutation) {
        this.salutation = salutation;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public MedProfType getType() {
        return type;
    }

    public void setType(MedProfType type) {
        this.type = type;
    }

    public long getDisciplineID() {
        return disciplineID;
    }

    public void setDisciplineID(long disciplineID) {
        this.disciplineID = disciplineID;
    }

    public String getRegistrationCode() {
        return registrationCode;
    }

    public void setRegistrationCode(String registrationCode) {
        this.registrationCode = registrationCode;
    }

    public String getInternalCode() {
        return internalCode;
    }

    public void setInternalCode(String internalCode) {
        this.internalCode = internalCode;
    }

    public long getWardID() {
        return wardID;
    }

    public void setWardID(long wardID) {
        this.wardID = wardID;
    }
}
