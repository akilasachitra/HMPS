package com.hmps.hmps.hardcodedtypes;

/**
 * Enum types of Blood groups
 */
public enum BloodGroup {

    A_POSITIVE(4000, "A+"),
    O_POSITIVE(4001, "O+"),
    B_POSITIVE(4002, "B+"),
    AB_POSITIVE(4003, "AB+"),
    A_NEGATIVE(4004, "A-"),
    O_NEGATIVE(4004, "O-"),
    B_NEGATIVE(4004, "B-"),
    AB_NEGATIVE(4004, "AB-");

    int id;
    String name;

    BloodGroup(int id, String name) {
        this.id = id;
        this.name = name;
    }

    @Override
    public String toString() {
        return name;
    }
}
