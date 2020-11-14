package com.aniamadej;

public class OffMachineState extends MachineState {

    public void turnOn(Machine machine){
        machine.setCurrentState(machine.getOnState());
        System.out.println("Machine is on");
    }

}
