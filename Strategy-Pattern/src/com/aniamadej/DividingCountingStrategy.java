package com.aniamadej;

public class DividingCountingStrategy implements CountingStrategy{
    @Override
    public Double count(Double x, Double y) {
        if (y==0) throw new IllegalArgumentException();
        return x / y;
    }
}
