package com.aniamadej;

public class Lamp extends Colleague{
    private boolean on = false;

    public Lamp(Mediator mediator) {
        super(mediator);
    }


    public boolean isOn() {
        return on;
    }

    public void turnOn() {
        this.on = true;
        System.out.println("Lamp is on");
    }

    public void turnOff() {
        this.on = false;
        System.out.println("Lamp is off");
    }
}
