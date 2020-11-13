package com.aniamadej;

public class Memento {

    private String someField;
    private int someNumberField;


    public Memento(SomeClass someClass) {
        this.someField = someClass.getSomeField();
        this.someNumberField = someClass.getSomeNumberField();
    }

    public String getSomeField() {
        return someField;
    }

    public int getSomeNumberField() {
        return someNumberField;
    }

    @Override
    public String toString() {
        return "Memento{" +
                "someField='" + someField + '\'' +
                ", someNumberField=" + someNumberField +
                '}';
    }
}
