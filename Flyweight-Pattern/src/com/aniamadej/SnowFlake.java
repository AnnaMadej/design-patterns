package com.aniamadej;

import java.awt.*;

public class SnowFlake {
    private Flyweight flyweight;
    private int fallingTimeDelay;
    private int size;

    public SnowFlake(Flyweight flyweight, int fallingTimeDelay, int size) {
        this.flyweight = flyweight;
        this.fallingTimeDelay = fallingTimeDelay;
        this.size = size;
    }

    public Flyweight getFlyWeight() {
        return this.flyweight;
    }
}
