package com.aniamadej;

public class Main {

    public static void main(String[] args) {
	LazySingleton singleton =LazySingleton.getInstance();
	System.out.println(singleton);

	LazySingleton singleton2 =LazySingleton.getInstance();
	System.out.println(singleton2);

	LazySingleton singleton3 =LazySingleton.getInstance();
	System.out.println(singleton3);


	EagerSingleton singleton4 = EagerSingleton.getInstance();
	System.out.println(singleton4);

        EagerSingleton singleton5 = EagerSingleton.getInstance();
        System.out.println(singleton5);


        EagerSingleton singleton6 = EagerSingleton.getInstance();
        System.out.println(singleton6);


        EagerSingleton singleton7 = EagerSingleton.getInstance();
        System.out.println(singleton7);
    }
}
