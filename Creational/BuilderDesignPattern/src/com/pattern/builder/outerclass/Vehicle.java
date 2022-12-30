package com.pattern.builder.outerclass;

public class Vehicle {
    private String engine;
    private int wheels;

    //optional parameter
    private int airBags;

    public Vehicle(String engine,int wheels,int airbags) {
        this.engine = engine;
        this.wheels = wheels;
        this.airBags = airbags;
    }

    public String getEngine() {
        return engine;
    }

    public int getWheels() {
        return wheels;
    }

    public int getAirBags() {
        return airBags;
    }


}
