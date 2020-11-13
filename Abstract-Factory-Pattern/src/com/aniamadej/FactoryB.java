package com.aniamadej;

public class FactoryB implements Factory {
    @Override
    public Product1 buildProduct1() {
        return new Product1B();
    }

    @Override
    public Product2 buildProduct2() {
        return new Product2B();
    }
}
