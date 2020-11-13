package com.aniamadej;

import java.awt.*;
import java.util.ArrayList;
import java.util.List;

public class Client {
    private List<Flyweight> snowFlakesCommonElements = new ArrayList<>();
    private List<SnowFlake> snowFlakes = new ArrayList<>();

    public void addSnowFlake(int startingPointX, int fallingSpeed, int fallingTimeDaley, int size){
        Flyweight flyweight = new Flyweight(new Point(startingPointX, 0),fallingSpeed );
        if (snowFlakesCommonElements.contains(flyweight)){
            flyweight = snowFlakesCommonElements.get(snowFlakesCommonElements.indexOf(flyweight));
        }
        else{
            snowFlakesCommonElements.add(flyweight);
        }
        SnowFlake flake = new SnowFlake(flyweight, fallingTimeDaley, fallingSpeed);
        if (!snowFlakes.contains(flake)){
            snowFlakes.add(flake);
        }
    }

    public List<Flyweight> getSnowFlakesCommonElements() {
        return snowFlakesCommonElements;
    }

    public List<SnowFlake> getSnowFlakes() {
        return snowFlakes;
    }
}
