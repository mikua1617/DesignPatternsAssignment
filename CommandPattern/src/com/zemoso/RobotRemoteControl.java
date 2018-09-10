package com.zemoso;

public class RobotRemoteControl {

    private Command command;

    public void setCommand(Command command){
        this.command = command;
    }
    public void pressButton(){
        command.execute();
    }
}

