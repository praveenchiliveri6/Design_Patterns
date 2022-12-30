package com.pattern.builder.innerclass;

import com.pattern.builder.outerclass.VehicleBuilder;

public class Vehicle {
    private String engine;
    private int wheels;

    //optional parameter
    private int airBags;

    private Vehicle(String engine,int wheels,int airbags) {
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

    public static class VehicleBuilder{
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


}
