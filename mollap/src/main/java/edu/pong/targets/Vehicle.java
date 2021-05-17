package edu.pong.targets;

public class Vehicle implements Target {
    
    @Override
    public void execution(String name){
        System.out.println("Door is open" + name);
    }
}