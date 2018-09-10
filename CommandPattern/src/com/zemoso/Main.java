package com.zemoso;

public class Main {

    public static void main(String[] args) {
        RobotRemoteControl control = new RobotRemoteControl();
        Robot robot = new Robot();

        Command robotTalk = new RobotTalkCommand(robot);
        Command robotRun = new RobotRunCommand(robot);

        control.setCommand(robotTalk);
        control.pressButton();
        control.setCommand(robotRun);
        control.pressButton();
    }
}
