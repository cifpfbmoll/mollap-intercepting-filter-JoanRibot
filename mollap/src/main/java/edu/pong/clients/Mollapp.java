package edu.pong.clients;

import edu.pong.administrator.TasksProgrammer;

public class Mollapp implements Client {

    private TasksProgrammer programmer;

    @Override
    public void setTasksProgrammer(TasksProgrammer programmer) {
        this.programmer = programmer;
    }

    @Override
    public void sendRequest(String name) {
        programmer.execution(name);
    }
}