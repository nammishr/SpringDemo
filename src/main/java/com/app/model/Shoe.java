package com.app.model;

public class Shoe {

    private String shoename;
    private String color;

    public Shoe(){}


    public Shoe(String shoename, String color) {
        this.shoename = shoename;
        this.color = color;
    }

    public String getShoename() {
        return shoename;
    }

    public void setShoename(String shoename) {
        this.shoename = shoename;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
}
