package com.aniamadej;

public class AddingHashesDecorator extends Decorator {

    public AddingHashesDecorator(Component component) {
        super(component);
    }

    @Override
    public void doSomething() {
        System.out.println("#############################");
        this.getComponent().doSomething();
        System.out.println("#############################");
    }
}
