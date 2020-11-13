package com.aniamadej;

public class Main {

    public static void main(String[] args) throws CloneNotSupportedException {

        ObjectProperty op1 = new ObjectProperty("op1");
        ObjectProperty op2 = new ObjectProperty("op2");



        SomeClass someClass1 = new SomeClass("lol", 1, op1);
        someClass1.print();

        SomeClass someClass2 = new SomeClass(someClass1);
        someClass2.print();

        SomeClass someClass3 = SomeClass.clone(someClass1);
        someClass3.print();

        SomeClass someClass4 = someClass1.clone();
        someClass4.print();

        System.out.println(someClass1);
        System.out.println(someClass2);
        System.out.println(someClass3);
        System.out.println(someClass4);

        someClass1.setSomeProperty("lol2");
        someClass1.setNumber(2);
        op1.setName("BUAHAHAHAHA");
        someClass1.print();
        someClass2.print();
        someClass3.print();
        someClass4.print();
    }
}
