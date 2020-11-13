package com.aniamadej;

import com.aniamadej.commands.*;
import com.aniamadej.devices.TVDevice;
import com.aniamadej.remotes.SimpleRemoteController;

public class Main {

    public static void main(String[] args) {
        TVDevice myTV = new TVDevice(32, 64, 100);

        SimpleRemoteController myRemote = new SimpleRemoteController();
        myRemote.setButton1(new TVDeviceTurnOnCommand(myTV));
        myRemote.setButton2(new TVDeviceVolumeUpCommand(myTV));
        myRemote.setButton3(new TVDeviceVolumeDownCommand(myTV));
        myRemote.setButton4(new TVDeviceChannelUpCommand(myTV));
        myRemote.setButton5(new TVDeviceChannelDownCommand(myTV));

        myRemote.pressButton1();
        myRemote.pressButton1();
        myRemote.pressButton2();
        myRemote.pressButton1();
        myRemote.pressButton2();
        myRemote.pressButton2();
        myRemote.pressButton3();
        myRemote.pressButton3();
        myRemote.pressButton3();
        myRemote.pressButton4();
        myRemote.pressButton5();
        myRemote.pressButton5();
        myRemote.pressButton5();
        myRemote.pressButton1();
    }
}
