package com.aniamadej;

public class SubtractingCountingStrategy implements CountingStrategy{
    @Override
    public Double count(Double x, Double y) {
        return x - y;
    }
}
