package com.aniamadej.commands;

import com.aniamadej.devices.TVDevice;

public class TVDeviceTurnOnCommand extends TVDeviceCommand{

    public TVDeviceTurnOnCommand(TVDevice device) {
        super(device);
    }

    @Override
    public void run() {
        this.getDevice().power();
    }

    @Override
    public void revoke() {
        this.getDevice().power();
    }
}
