package com.zemoso;

public class Scorpio extends CarPrototype{

    public Scorpio() {
        this.carName="Scorpio";
        this.speed=0;
    }

    @Override
    void runCar(){
        this.speed=100;
        System.out.println(this.carName+" car runnning at "+this.speed+" kmph");
    }
}
