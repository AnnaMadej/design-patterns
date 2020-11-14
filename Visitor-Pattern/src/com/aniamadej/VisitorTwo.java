package com.aniamadej;

public class VisitorTwo implements Visitor {
    @Override
    public void visit(ElementA elementA) {
        System.out.println("Invoking behaviour Two on element A");
        elementA.doSomething();
    }

    @Override
    public void visit(ElementB elementB) {
        System.out.println("Invoking behaviour Two on element B");
        elementB.someMethod();
    }
}
