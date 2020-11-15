package com.aniamadej;

public class Main {

    public static void main(String[] args) {
        CoffeeMakerFacade facade
                = new CoffeeMakerFacade(new GrainsGrinder(), new WaterBoiler(), new WaterSupply(), new WaterPressure());

        facade.makeCoffee();
    }
}
