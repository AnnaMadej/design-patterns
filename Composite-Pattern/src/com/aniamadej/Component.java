package com.aniamadej;

public abstract class Component {
    private String name;
    public abstract void doSomething(String whatToDo);

    public String getName() {
        return name;
    }

    public Component(String name) {
        this.name = name;
    }
}
