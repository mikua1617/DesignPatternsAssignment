package com.zemoso;

public class Robot {

    int speed;

    public void talk(){
        System.out.println("I am ASIMO");
    }

    public void run(){

        if(this.speed==60){
            System.out.println("Already running");
            System.out.println("Running at "+this.speed);
        }
        else{
            this.speed=60;
            System.out.println("Running at "+this.speed);
        }

    }
}
