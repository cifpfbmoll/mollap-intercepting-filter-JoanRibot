package edu.pong.filters;


public class Authentication implements Filter{

    @Override
    public void execution(String name) {
        System.out.println("Authentication OK for " + name);
    }
}