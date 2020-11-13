package com.aniamadej.commands;

import com.aniamadej.devices.TVDevice;

public abstract class TVDeviceCommand implements Command {
    private TVDevice device;

    public TVDeviceCommand(TVDevice device) {
        this.device = device;
    }

    public TVDevice getDevice() {
        return device;
    }
}
