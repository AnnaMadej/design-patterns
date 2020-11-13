package com.aniamadej;

import java.util.ArrayList;
import java.util.List;

public class Composite extends Component {
    private List<Component> components = new ArrayList<>();

    public Composite(String name) {
        super(name);
    }

    public void addComponent(Component component){
        this.components.add(component);
    }

    public void doSomething(String whatToDo){
        System.out.println(this.getName() + " Ordering " + whatToDo + "!");
        components.forEach(c-> c.doSomething(whatToDo));
    }
}
