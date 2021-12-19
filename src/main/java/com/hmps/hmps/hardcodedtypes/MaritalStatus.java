package com.hmps.hmps.hardcodedtypes;

/**
 * Enum types of Marital Statuses
 */
public enum MaritalStatus {

    SINGLE(5001, "Single"),
    MARRIED(5002, "Married"),
    WIDOWED(5003, "Widowed"),
    DIVORCED(5004, "Divorced "),
    SEPARATED(5005, "Separated");

    int id;
    String name;

    MaritalStatus(int id, String name) {
        this.id = id;
        this.name = name;
    }

}
