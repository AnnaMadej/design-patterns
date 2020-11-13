package com.aniamadej;

public class MultiplicatingCountingStrategy implements CountingStrategy{
    @Override
    public Double count(Double x, Double y) {
        return x * y;
    }
}
