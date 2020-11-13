package com.aniamadej;

public class SomeClass implements Cloneable {
    private String someProperty;
    private int number;

    private ObjectProperty someObjectProperty;

    public SomeClass(SomeClass source){
        this.someProperty = source.getSomeProperty();
        this.setNumber(source.getNumber());
        this.someObjectProperty = new ObjectProperty(source.someObjectProperty.getName());
    }

    public SomeClass(String someProperty, int number, ObjectProperty obp){
       this.someProperty = someProperty;
       this.setNumber(number);
       this.someObjectProperty = obp;
    }


    public String getSomeProperty() {
        return someProperty;
    }

    public void setSomeProperty(String someProperty) {
        this.someProperty = someProperty;
    }

    public SomeClass clone() {
        try{
           SomeClass clone = (SomeClass) SomeClass.super.clone();
           clone.someObjectProperty = this.someObjectProperty.clone();
           return clone;
        }catch (CloneNotSupportedException e){

        }
        return null;
    }

    public static SomeClass clone(SomeClass source){
        SomeClass clone = new SomeClass(source.someProperty, source.number,  new ObjectProperty(source.someObjectProperty.getName()));
        return clone;
    }

    public void print(){
        System.out.println(this.getSomeProperty() + " " + this.getNumber() + " " + this.someObjectProperty.getName());
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public void setSomeObjectProperty(ObjectProperty someObjectProperty) {
        this.someObjectProperty = someObjectProperty;
    }
}
