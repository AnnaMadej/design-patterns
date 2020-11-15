package com.aniamadej;

public class Main {

    public static void main(String[] args) {
        ConcreteObserver1 observer1 = new ConcreteObserver1();
        ConcreteObserver2 observer2 = new ConcreteObserver2();

        ConcreteSubject subject = new ConcreteSubject();

        subject.addObserver(observer1);
        subject.addObserver(observer2);

        subject.setState("abcd");

        System.out.println(observer1.getCharArray());
        System.out.println(observer2.getChars());

        subject.setState("efgh");

        System.out.println(observer1.getCharArray());
        System.out.println(observer2.getChars());

    }
}
