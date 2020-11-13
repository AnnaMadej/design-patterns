package com.aniamadej;

public class SomeClass {
   private String someField;
   private int someNumberField;

   public  Memento getMemento(){
       return new Memento(this);
   }

    public SomeClass(String someField, int someNumberField) {
        this.someField = someField;
        this.someNumberField = someNumberField;
    }

    public String getSomeField() {
        return someField;
    }

    public int getSomeNumberField() {
        return someNumberField;
    }

    public void restore(Memento memento){
       this.someField = memento.getSomeField();
       this.someNumberField = memento.getSomeNumberField();
    }

    @Override
    public String toString() {
        return "SomeClass{" +
                "someField='" + someField + '\'' +
                ", someNumberField=" + someNumberField +
                '}';
    }

    public void setSomeField(String someField) {
        this.someField = someField;
    }

    public void setSomeNumberField(int someNumberField) {
        this.someNumberField = someNumberField;
    }
}
