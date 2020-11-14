package com.aniamadej;

public class ElementB implements Element {
    @Override
    public void accept(Visitor visitor) {
        visitor.visit(this);
    }

    public void someMethod(){
        System.out.println("and calling method someMethod()");
    }
}
