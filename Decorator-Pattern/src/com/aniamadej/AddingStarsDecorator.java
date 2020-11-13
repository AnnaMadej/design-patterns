package com.aniamadej;

public class AddingStarsDecorator extends Decorator {
    public AddingStarsDecorator(Component component) {
        super(component);
    }

    @Override
    public void doSomething() {
        System.out.println("*****************************");
        this.getComponent().doSomething();
        System.out.println("*****************************");
    }
}
