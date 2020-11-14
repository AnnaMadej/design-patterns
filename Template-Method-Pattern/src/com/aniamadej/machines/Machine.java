package com.aniamadej.machines;

public abstract class Machine {
    public void run(){
        turnOn();
        doAction();
        turnOff();
    }

    private void turnOn(){
        System.out.println("Turning On");
    }

    private void turnOff(){
        System.out.println("Turning Off");
    }

    protected abstract void doAction();
}
