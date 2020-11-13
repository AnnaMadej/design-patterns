package com.aniamadej.commands;

import com.aniamadej.devices.TVDevice;

public class TVDeviceVolumeDownCommand extends TVDeviceCommand{

    public TVDeviceVolumeDownCommand(TVDevice device) {
        super(device);
    }

    @Override
    public void run() {
        this.getDevice().volumeDown();
    }

    @Override
    public void revoke() {
        this.getDevice().volumeUp();
    }
}
