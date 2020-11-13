package com.aniamadej;

public class Factory2 implements Factory{
    @Override
    public Product getProduct() {
        return new Product2();
    }
}
