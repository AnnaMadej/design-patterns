package com.aniamadej;

public class Main {

    public static void main(String[] args) {
        Composite general1 = new Composite("general1");
        Composite general2 = new Composite("general2");

        Composite captain1 = new Composite("captain1");
        Composite captain2 = new Composite("captain2");
        Composite captain3 = new Composite("captain3");

        Leaf soldier1 = new Leaf("soldier1");
        Leaf soldier2 = new Leaf("soldier2");
        Leaf soldier3 = new Leaf("soldier3");
        Leaf soldier4 = new Leaf("soldier4");

        Leaf soldier5 = new Leaf("soldier5");
        Leaf soldier6 = new Leaf("soldier6");
        Leaf soldier7 = new Leaf("soldier7");
        Leaf soldier8 = new Leaf("soldier8");

        captain1.addComponent(soldier1);
        captain1.addComponent(soldier2);

        captain2.addComponent(soldier3);
        captain2.addComponent(soldier4);
        captain2.addComponent(soldier5);

        captain2.addComponent(soldier6);

        captain3.addComponent(soldier7);
        captain3.addComponent(soldier8);

        general1.addComponent(captain1);
        general2.addComponent(captain2);
        general1.addComponent(captain3);

        general1.doSomething("attack");
        general2.doSomething("retreat");


    }
}
