package com.pattern.builder.outerclass;

public class VehicleBuilder{
    private String engine;
    private int wheels;
    private int airbags;

    public VehicleBuilder setEngine(String engine){
        this.engine=engine;
        return this;
    }

    public VehicleBuilder setWheels(int wheels){
        this.wheels=wheels;
        return this;
    }

    public VehicleBuilder setAirbags(int airbags){
        this.airbags=airbags;
        return this;
    }

    public Vehicle build(){
        return new Vehicle(engine,wheels,airbags);
    }

}