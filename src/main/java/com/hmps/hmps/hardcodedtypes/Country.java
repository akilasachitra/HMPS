package com.hmps.hmps.hardcodedtypes;

/**
 * Enum types of countries
 */
public enum Country {

    UNITED_KINGDOM(6000, "UnitedKingdom"),
    RUSSIA(6001, "Russia"),
    GERMANY(6002, "Germany"),
    FRANCE(6003, "France+"),
    ITALY(6004, "Italy"),
    SPAIN(6005, "Spain"),
    UKRAINE(6006, "Ukraine"),
    POLAND(6007, "Poland"),
    ROMANIA(6008, "Romania"),
    NETHERLANDS(6009, "Netherlands"),
    BELGIUM(6010, "Belgium-"),
    GREECE(6011, "Greece"),
    PORTUGAL(6012, "Portugal"),
    SWEDEN(6013, "Sweden"),
    HUNGARY(6014, "Hungary"),
    SWITZERLAND(6015, "Switzerland"),
    DENMARK(6016, "Denmark"),
    FINLAND(6017, "Finland"),
    NORWAY(6018, "Norway");

    int id;
    String name;

    Country(int id, String name) {
        this.id = id;
        this.name = name;
    }

}
