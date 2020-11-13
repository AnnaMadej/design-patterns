package com.aniamadej;

public class Factory1 implements Factory{
    @Override
    public Product getProduct() {
        return new Product1();
    }
}
