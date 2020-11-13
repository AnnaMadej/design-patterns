package com.aniamadej.commands;

import com.aniamadej.devices.TVDevice;

public class TVDeviceBrightnessDownCommand extends TVDeviceCommand{

    public TVDeviceBrightnessDownCommand(TVDevice device) {
        super(device);
    }

    @Override
    public void run() {
        this.getDevice().lessBrightness();
    }

    @Override
    public void revoke() {
        this.getDevice().moreBrightness();
    }
}
