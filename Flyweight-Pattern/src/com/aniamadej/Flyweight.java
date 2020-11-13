package com.aniamadej;

import java.awt.*;

public class Flyweight {
    private Point startingPoint;
    private int fallingSpeed;

    public Flyweight(Point startingPoint, int fallingSpeed) {
        this.startingPoint = startingPoint;
        this.fallingSpeed = fallingSpeed;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Flyweight flyweight = (Flyweight) o;

        if (fallingSpeed != flyweight.fallingSpeed) return false;
        return startingPoint.equals(flyweight.startingPoint);
    }

    @Override
    public int hashCode() {
        int result = startingPoint.hashCode();
        result = 31 * result + fallingSpeed;
        return result;
    }
}
