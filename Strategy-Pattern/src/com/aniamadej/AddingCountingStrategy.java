package com.aniamadej;

public class AddingCountingStrategy implements CountingStrategy{
    @Override
    public Double count(Double x, Double y) {
        return x + y;
    }
}
