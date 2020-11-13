package com.aniamadej;

public class Leaf extends Component {
    public Leaf(String name) {
        super(name);
    }

    @Override
    public void doSomething(String whatToDo) {
        System.out.println("\t" + this.getName() + " Doing " + whatToDo + "");
    }
}
