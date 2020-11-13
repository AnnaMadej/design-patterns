package com.aniamadej;

public class Main {

    public static void main(String[] args) {
	Factory f1 = new Factory1();
	Factory f2 = new Factory2();

	f1.getProduct().print();
	f2.getProduct().print();
    }
}
