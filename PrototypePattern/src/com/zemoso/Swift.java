package com.zemoso;

public class Swift extends CarPrototype {

    public Swift() {
        this.carName="Swift";
        this.speed=0;
    }

    @Override
    void runCar(){
        this.speed=60;
        System.out.println(this.carName+" car runnning at "+this.speed+" kmph");
    }
}
