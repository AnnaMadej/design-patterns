package com.aniamadej;

public class BlinkingMachineState extends MachineState {

    public void turnOff(Machine machine){
        machine.setCurrentState(machine.getOffState());
        System.out.println("Machine is off");
    }

    public void stopBlinking(Machine machine){
        machine.setCurrentState(machine.getOnState());
        System.out.println("Machine is not blinking anymore but is on");
    }
}
