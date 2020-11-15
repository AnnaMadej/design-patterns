package com.aniamadej;

public class CoffeeMakerFacade {
    private GrainsGrinder grainsGrinder;
    private WaterBoiler waterBoiler;
    private WaterSupply waterSupply;
    private WaterPressure waterPressure;

    public CoffeeMakerFacade(GrainsGrinder grainsGrinder, WaterBoiler waterBoiler, WaterSupply waterSupply, WaterPressure waterPressure) {
        this.grainsGrinder = grainsGrinder;
        this.waterBoiler = waterBoiler;
        this.waterSupply = waterSupply;
        this.waterPressure = waterPressure;
    }

    public void makeCoffee() {
        grainsGrinder.grindGrains();
        waterSupply.supplyWater();
        waterBoiler.boilWater();
        waterPressure.pressWater();
    }
}
