package com.aniamadej;

public class Main {

    public static void main(String[] args) {
	Factory factoryA = new FactoryA();
	Factory factoryB = new FactoryB();


	factoryA.buildProduct1().printName();
	factoryA.buildProduct2().printName();

	factoryB.buildProduct1().printName();
	factoryB.buildProduct2().printName();
    }
}
