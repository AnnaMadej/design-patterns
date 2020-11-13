package com.aniamadej;

public class Product {
    private String title;
    private int number;

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public void print(){
        System.out.println(this.getNumber() + this.getTitle());
    }
}
