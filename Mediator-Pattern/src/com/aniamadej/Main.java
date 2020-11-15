package com.aniamadej;

public class Main {


    public static void main(String[] args) {
        LampSwitchPowerMediator mediator = new LampSwitchPowerMediator();
        Lamp lamp = new Lamp(mediator);
        PowerSupply powerSupply = new PowerSupply(mediator);
        WallSwitch wallSwitch = new WallSwitch(mediator);

        mediator.setLamp(lamp);
        mediator.setPowerSupply(powerSupply);
        mediator.setWallSwitch(wallSwitch);

        wallSwitch.press();
        wallSwitch.press();

        powerSupply.setOff();
        wallSwitch.press();

        powerSupply.setOn();
        wallSwitch.press();

        powerSupply.setOff();

    }



}
