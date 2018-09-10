package com.zemoso;

public class RobotTalkCommand implements Command{

    Robot robot;

    public RobotTalkCommand(Robot robot){
        this.robot = robot;
    }

    public void execute(){
        robot.talk();
    }
}
