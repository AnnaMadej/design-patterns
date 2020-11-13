package com.aniamadej.devices;

public class TVDevice {

    private int volume = 0;
    private int currentChannel = 1;
    private int currentBrightness = 32;
    boolean isOn = false;
    private final int MAX_VOLUME;
    private final int MAX_BRIGHTNESS;
    private final int NR_OF_CHANNELS;


    public TVDevice(int MAX_VOLUME, int MAX_BRIGHTNESS, int NR_OF_CHANNELS) {
        this.MAX_VOLUME = MAX_VOLUME;
        this.MAX_BRIGHTNESS = MAX_BRIGHTNESS;
        this.NR_OF_CHANNELS = NR_OF_CHANNELS;
    }

    public void power() {
        this.isOn = !this.isOn;
        printPowerState();
    }

    private void printPowerState() {
        System.out.println("TV  IS " + (this.isOn ? "ON!" : "OFF!"));
    }

    public void volumeUp() {
        if (this.isOn) {
            if (this.volume < MAX_VOLUME) {
                volume++;
                printVolumeState();
            }
        }
    }

    private void printVolumeState() {
        System.out.println("TV volume is now at: " + this.volume);
    }

    public void volumeDown() {
        if (this.isOn) {
            if (this.volume > 0) {
                volume--;
            }
            printVolumeState();
        }
    }

    public void next() {
        if (this.isOn) {
            if (this.currentChannel < NR_OF_CHANNELS) {
                currentChannel++;
            } else {
                currentChannel = 1;
            }
            printChannelNr();
        }
    }

    private void printChannelNr() {
        System.out.println("Current channel is now at : " + this.currentChannel);
    }

    public void previous() {
        if (this.isOn) {
            if (this.currentChannel > 0) {
                currentChannel--;
            } else {
                currentChannel = 100;
            }
            printChannelNr();
        }
    }

    public void moreBrightness() {
        if (this.isOn) {
            if (this.currentBrightness < MAX_BRIGHTNESS) {
                currentBrightness++;
            }
            printBrightnessState();
        }
    }

    public void lessBrightness() {
        if (this.isOn) {
            if (this.currentBrightness > 0) {
                currentBrightness--;
            }
            printBrightnessState();
        }
    }

    private void printBrightnessState() {
        System.out.println("TV brightness is now at: " + this.currentBrightness);
    }


}
