package com.aniamadej;

public class Main {

    public static void main(String[] args) {
	ProductBuilder prod1aBuilder = new Type1AProductBuilder();
	ProductBuilder prod2bBuilder = new Type2BProductBuilder();

	prod1aBuilder.buildProduct();
	prod2bBuilder.buildProduct();

    prod1aBuilder.getProduct().print();
    prod2bBuilder.getProduct().print();
    }
}
