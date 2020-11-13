package com.aniamadej;

public class AddingLinesDecorator extends Decorator {
    public AddingLinesDecorator(Component component) {
        super(component);
    }

    @Override
    public void doSomething() {
        System.out.println("-----------------------------");
        this.getComponent().doSomething();
        System.out.println("-----------------------------");
    }
}
