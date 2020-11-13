package com.aniamadej;

public class Calculator {
    private CountingStrategy currentStrategy;

    public void setCurrentStrategy(CountingStrategy currentStrategy) {
        this.currentStrategy = currentStrategy;
    }

    public Double count(Double x, Double y){
        return currentStrategy.count(x,y);
    }
}
