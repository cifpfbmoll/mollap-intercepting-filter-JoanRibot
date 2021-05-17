package edu.pong.filters;

public class Authorization implements Filter{

    @Override
    public void execution(String name) {
    System.out.println("Authorizaation OK for " + name);
    }
}