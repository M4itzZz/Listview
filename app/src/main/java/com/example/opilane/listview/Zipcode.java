package com.example.opilane.listview;

public class Zipcode {
    private final String code;
    private final String city;

    //konstruktorid
    public Zipcode(String code, String city) {
        this.code = code;
        this.city = city;
    }
    //getterid
    public String getCode() {
        return code;
    }

    public String getCity() {
        return city;
    }
    //sellega kuvame hiljem listis oma andmed näide: 13512 Õismägi
    public String toString(){
        return getCode() + " " + getCity();
    }
}

