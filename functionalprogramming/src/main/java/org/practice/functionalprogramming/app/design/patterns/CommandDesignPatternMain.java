package org.practice.functionalprogramming.app.design.patterns;

public class CommandDesignPatternMain {

    public static void main(String[] args) {

        AC ac = new AC();
        AC ac1 = new AC();
        ACRemote remote= new ACRemote();

        remote.setCommand(ac1::turnOn);
        remote.buttonPressed();

    }
}

class AC{

    public void turnOn(){
        System.out.println("Turning ON the AC");
    }

    public void turnOff(){
        System.out.println("Turning OFF the AC");
    }

    public void incTemp(){
        System.out.println("Increasing the temperature");
    }

    public void decTemp(){
        System.out.println("Decreasing the temperature");
    }

}

class ACRemote{

    Command command;

    public void setCommand(Command command){
        this.command=command;
    }

    public void buttonPressed(){
        command.execute();
    }

}

interface Command{
    void execute();
}
