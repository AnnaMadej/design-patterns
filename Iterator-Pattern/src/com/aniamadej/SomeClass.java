package com.aniamadej;

import java.util.Iterator;
import java.util.stream.Stream;

public class SomeClass implements Iterable<String> {

    private String[] elements;

    public SomeClass(String[] elements) {
        this.elements = elements;
    }


    public String[] getElements() {
        return elements;
    }

    public void setElements(String[] elements) {
        this.elements = elements;
    }


    @Override
    public Iterator<String> iterator() {
        return new SomeClassIterator(this);
    }
}
