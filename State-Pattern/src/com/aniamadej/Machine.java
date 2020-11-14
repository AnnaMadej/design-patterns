package com.aniamadej;

public class Machine {
    private MachineState onState = new OnMachineState();
    private MachineState offState = new OffMachineState();
    private MachineState blinkingState = new BlinkingMachineState();

    private MachineState currentState = this.offState;


    public MachineState getCurrentState() {
        return currentState;
    }

    public MachineState getOnState() {
        return onState;
    }

    public MachineState getOffState() {
        return offState;
    }

    public MachineState getBlinkingState() {
        return blinkingState;
    }

    public void setCurrentState(MachineState currentState) {
        this.currentState = currentState;
    }

    public void turnOn() {
        this.currentState.turnOn(this);
    }

    public void turnOff() {
        this.currentState.turnOff(this);
    }

    public void startBlinking() {
        this.currentState.startBlinking(this);
    }

    public void stopBlinking() {
        this.currentState.stopBlinking(this);
    }
}
