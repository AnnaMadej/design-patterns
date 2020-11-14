package com.aniamadej;

public class Main {

    public static void main(String[] args) {
        Visitor visitor1 = new VisitorOne();
        Visitor visitor2 = new VisitorTwo();

        Element elementA = new ElementA();
        Element elementB = new ElementB();

        elementA.accept(visitor1);
        System.out.println();
        elementA.accept(visitor2);
        System.out.println();
        elementB.accept(visitor1);
        System.out.println();
        elementB.accept(visitor2);
    }
}
