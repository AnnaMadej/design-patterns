package com.aniamadej;

public class ToFilter {
    private String name;
    private int number;
    private boolean isOK;

    public ToFilter(String name, int number, boolean isOK) {
        this.name = name;
        this.number = number;
        this.isOK = isOK;
    }

    public String getName() {
        return name;
    }

    public int getNumber() {
        return number;
    }

    public boolean isOK() {
        return isOK;
    }

    @Override
    public String toString() {
        return "ToFilter{" +
                "name='" + name + '\'' +
                ", number=" + number +
                ", isOK=" + isOK +
                '}';
    }
}

