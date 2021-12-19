package com.hmps.hmps.hardcodedtypes;

/**
 * Enum types of medical professionals
 */
public enum MedProfType {

    DOCTOR(1000, "Doctor"),
    SURGEON(1001, "Surgeon"),
    NURSE(1002, "Nurse"),
    ATTENDANT(1003, "Attendant"),
    RADIOLOGIST(1004, "Radiologist"),
    ONCOLOGIST(1005, "Oncologist"),
    DENTIST(1006, "Dentist"),
    PHARMACIST(1007, "Pharmacist");

    int id;
    String name;

    MedProfType(int id, String name) {
        this.id = id;
        this.name = name;
    }

}
