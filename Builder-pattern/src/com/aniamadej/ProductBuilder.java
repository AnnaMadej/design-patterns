package com.aniamadej;

public abstract class ProductBuilder {

    private Product product;

    public void buildProduct(){
        initializeProduct();
        addTitle();
        setNumber();
    }

    public abstract void initializeProduct();

    public abstract void addTitle();

    public abstract void setNumber();

    protected void setProduct(Product product){
        this.product = product;
    }

    public Product getProduct() {
        return product;
    }
}
