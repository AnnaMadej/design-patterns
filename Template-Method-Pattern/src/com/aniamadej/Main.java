package com.aniamadej;

import com.aniamadej.machines.BlinkingMachine;
import com.aniamadej.machines.Machine;
import com.aniamadej.machines.MusicMachine;

public class Main {

    public static void main(String[] args) {
        Machine machine;
        machine = new MusicMachine();
        machine.run();

        machine = new BlinkingMachine();
        machine.run();
    }
}
