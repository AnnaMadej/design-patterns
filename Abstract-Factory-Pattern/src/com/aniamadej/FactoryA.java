package com.aniamadej;

public class FactoryA implements Factory {
    @Override
    public Product1 buildProduct1() {
        return new Product1A();
    }

    @Override
    public Product2 buildProduct2() {
        return new Product2A();
    }
}
