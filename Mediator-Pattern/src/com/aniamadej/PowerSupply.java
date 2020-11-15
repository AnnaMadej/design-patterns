package com.aniamadej;

public class PowerSupply extends Colleague {
    private boolean powered = true;

    public PowerSupply(Mediator mediator) {
        super(mediator);
    }

    public boolean isPowered() {
        return powered;
    }

    public void setOff() {
        this.powered = false;
        getMediator().mediate();
    }

    public  void setOn(){
        this.powered = true;
    }
}
