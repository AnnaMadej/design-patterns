package com.aniamadej;

public class WallSwitch extends Colleague {
    public WallSwitch(Mediator mediator) {
        super(mediator);
    }

    public void press(){
        this.getMediator().mediate();
    }


}
