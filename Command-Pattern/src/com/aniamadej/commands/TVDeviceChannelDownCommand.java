package com.aniamadej.commands;

import com.aniamadej.devices.TVDevice;

public class TVDeviceChannelDownCommand extends TVDeviceCommand{

    public TVDeviceChannelDownCommand(TVDevice device) {
        super(device);
    }

    @Override
    public void run() {
        this.getDevice().previous();
    }

    @Override
    public void revoke() {
        this.getDevice().next();
    }
}
