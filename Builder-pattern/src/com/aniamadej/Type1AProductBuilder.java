package com.aniamadej;

public class Type1AProductBuilder extends ProductBuilder{
    @Override
    public void initializeProduct() {
        this.setProduct(new Product1A());
    }

    @Override
    public void addTitle() {
        this.getProduct().setTitle("A");
    }

    @Override
    public void setNumber() {
        this.getProduct().setNumber(1);
    }
}
