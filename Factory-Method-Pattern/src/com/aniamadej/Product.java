package com.aniamadej;

public abstract class Product {
    private String name;

    public String getName() {
        return name;
    }

    public Product(String name) {
        this.name = name;
    }

    public void print(){
        System.out.println(this.name);
    }
}
