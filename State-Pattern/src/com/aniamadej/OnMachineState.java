package com.aniamadej;

public class OnMachineState extends MachineState {

    public void turnOff(Machine machine){
        machine.setCurrentState(machine.getOffState());
        System.out.println("Machine is off");
    }

    public void startBlinking(Machine machine){
        machine.setCurrentState(machine.getBlinkingState());
        System.out.println("Machine is blinking");
    }

}
