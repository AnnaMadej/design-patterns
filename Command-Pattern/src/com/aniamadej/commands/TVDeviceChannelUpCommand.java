package com.aniamadej.commands;

import com.aniamadej.devices.TVDevice;

public class TVDeviceChannelUpCommand extends TVDeviceCommand{

    public TVDeviceChannelUpCommand(TVDevice device) {
        super(device);
    }

    @Override
    public void run() {
        this.getDevice().next();
    }

    @Override
    public void revoke() {
        this.getDevice().previous();
    }
}
