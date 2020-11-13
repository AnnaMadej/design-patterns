package com.aniamadej.commands;

import com.aniamadej.devices.TVDevice;

public class TVDeviceVolumeUpCommand extends TVDeviceCommand{

    public TVDeviceVolumeUpCommand(TVDevice device) {
        super(device);
    }

    @Override
    public void run() {
        this.getDevice().volumeUp();
    }

    @Override
    public void revoke() {
        this.getDevice().volumeDown();
    }
}
