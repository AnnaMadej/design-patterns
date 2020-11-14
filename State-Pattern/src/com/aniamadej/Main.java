package com.aniamadej;

public class Main {

    public static void main(String[] args) {
        Machine machine = new Machine();
        machine.startBlinking();
        machine.stopBlinking();
        machine.turnOff();

        machine.turnOn();
        machine.startBlinking();
        machine.stopBlinking();
        machine.turnOff();

        machine.turnOn();
        machine.startBlinking();
        machine.turnOn();
        machine.startBlinking();
        machine.stopBlinking();
        machine.turnOff();
    }
}
