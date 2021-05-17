package edu.pong.clients;

import edu.pong.administrator.TasksProgrammer;

public interface Client {

    public void setTasksProgrammer(TasksProgrammer programmer);
    public void sendRequest(String request);
}