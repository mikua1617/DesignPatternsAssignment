package com.zemoso;

public class RobotRunCommand implements Command{

    Robot robot;

    public RobotRunCommand(Robot robot){
        this.robot = robot;
    }

    public void execute(){
        robot.run();
    }
}
