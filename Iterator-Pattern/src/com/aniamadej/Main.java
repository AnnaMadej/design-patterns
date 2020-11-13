package com.aniamadej;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        SomeClass someClass = new SomeClass(new String[]{"a", "b", "c", "d"});

        Iterator<String> it = someClass.iterator();


        while(it.hasNext()){
            System.out.println(it.next());
        }


        Iterator<String> it2 = someClass.iterator();

        it2.next();
        it2.next();
        it2.next();
        it2.next();

        it2.forEachRemaining(System.out::println);

        Iterator it3 = someClass.iterator();

        it3.remove();
        it3.remove();
        it3.remove();
        it3.remove();

        while(it3.hasNext()){
            System.out.println(it3.next());
        }

        System.out.println(someClass.getElements().length);
    }
}
