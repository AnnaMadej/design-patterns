package com.aniamadej.commands;

import com.aniamadej.devices.TVDevice;

public class TVDeviceBrightnessUpCommand extends TVDeviceCommand{

    public TVDeviceBrightnessUpCommand(TVDevice device) {
        super(device);
    }

    @Override
    public void run() {
        this.getDevice().moreBrightness();
    }

    @Override
    public void revoke() {
        this.getDevice().lessBrightness();
    }
}
