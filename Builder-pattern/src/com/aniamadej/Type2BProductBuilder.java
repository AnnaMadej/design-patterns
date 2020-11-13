package com.aniamadej;

public class Type2BProductBuilder extends ProductBuilder{
    @Override
    public void initializeProduct() {
        this.setProduct(new Product2B());
    }

    @Override
    public void addTitle() {
        this.getProduct().setTitle("B");
    }

    @Override
    public void setNumber() {
        this.getProduct().setNumber(2);
    }
}
