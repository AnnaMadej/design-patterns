package com.aniamadej;

public class LampSwitchPowerMediator implements Mediator {

    private Lamp lamp;
    private WallSwitch wallSwitch;
    private PowerSupply powerSupply;

    public void setLamp(Lamp lamp) {
        this.lamp = lamp;
    }

    public void setWallSwitch(WallSwitch wallSwitch) {
        this.wallSwitch = wallSwitch;
    }

    public void setPowerSupply(PowerSupply powerSupply) {
        this.powerSupply = powerSupply;
    }

    @Override
    public void mediate() {
        if(!this.lamp.isOn()){
            if(powerSupply.isPowered()){
                lamp.turnOn();
            }
            else {
                System.out.println("There is no power!");
            }
        }
        else {
            lamp.turnOff();
        }
    }
}
