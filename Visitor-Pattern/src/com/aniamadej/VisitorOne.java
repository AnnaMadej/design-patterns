package com.aniamadej;

public class VisitorOne implements Visitor {
    @Override
    public void visit(ElementA elementA) {
        System.out.println("Invoking behaviour One on element A");
        elementA.doSomething();
    }

    @Override
    public void visit(ElementB elementB) {
        System.out.println("Invoking behaviour One on element B");
        elementB.someMethod();
    }
}
