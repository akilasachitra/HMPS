package com.hmps.hmps.hardcodedtypes;

/**
 * Enum types of Gender
 */
public enum Gender {

    MALE(2000, "Male"),
    FEMALE(2001, "Female"),
    TRANS(2002, "Transgender"),
    UNCONFIRMED(2003, "Unconfirmed"),
    UNKNOWN(2004, "Unknown");

    int id;
    String name;

    Gender(int id, String name) {
        this.id = id;
        this.name = name;
    }

}
