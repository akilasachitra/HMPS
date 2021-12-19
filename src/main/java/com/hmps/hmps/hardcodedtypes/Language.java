package com.hmps.hmps.hardcodedtypes;

/**
 * Enum types of Languages
 */
public enum Language {

    ENGLISH(7001, "English"),
    FRENCH(7002, "French"),
    German(7003, "German"),
    Turkish(7004, "Turkish"),
    Italian(7005, "Italian"),
    Spanish(7006, "Spanish"),
    Polish(7007, "Polish");

    int id;
    String name;

    Language(int id, String name) {
        this.id = id;
        this.name = name;
    }

}
