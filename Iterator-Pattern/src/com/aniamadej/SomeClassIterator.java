package com.aniamadej;

import java.util.Arrays;
import java.util.Iterator;
import java.util.function.Consumer;
import java.util.stream.Stream;

public class SomeClassIterator implements Iterator<String> {

    private SomeClass objectToIterate;
    private int index = -1;

    public SomeClassIterator(SomeClass objectToIterate) {
        this.objectToIterate = objectToIterate;
    }


    @Override
    public boolean hasNext() {
        return objectToIterate.getElements().length-1>index;
    }

    @Override
    public String next() {
        if(hasNext()){
            index++;
            return objectToIterate.getElements()[index];
        }
        return null;
    }

    @Override
    public void remove() {
        objectToIterate.setElements(Arrays.stream(objectToIterate.getElements())
                .filter(e -> !e.equals(objectToIterate.getElements()[index+1])).toArray(String[]::new));
    }

    @Override
    public void forEachRemaining(Consumer<? super String> action) {
        String[] elements = Stream.of(objectToIterate.getElements()).skip(index+1).toArray(String[]::new);
        for (String element : elements) {
            action.accept(element);
        }
    }
}
