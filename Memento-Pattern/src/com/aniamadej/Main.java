package com.aniamadej;

public class Main {

    public static void main(String[] args) {
        CareTaker careTaker = new CareTaker();

        SomeClass someClass = new SomeClass("a", 1);

        careTaker.addMemento(someClass.getMemento());

        someClass.setSomeField("b");

        careTaker.addMemento(someClass.getMemento());

        System.out.println(careTaker.getMementos());

        someClass.setSomeNumberField(2);

        careTaker.addMemento(someClass.getMemento());

        System.out.println(careTaker.getMementos());

        careTaker.removeMemento(1);

        System.out.println(careTaker.getMementos());

        System.out.println(someClass);

        someClass.restore(careTaker.getMemento(0));

        System.out.println(someClass);
    }
}
