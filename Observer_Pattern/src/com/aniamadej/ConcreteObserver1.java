package com.aniamadej;

public class ConcreteObserver1 extends Observer {
    private char[] charArray;

    @Override
    public void update(String state) {
        this.charArray = state.toCharArray();
    }

    public char[] getCharArray() {
        return charArray;
    }
}
