package intercepting.clients;

import intercepting.administrador.TaskProgrammerk;

public class Mollapp implements Client {

    private TaskProgrammer programmer;

    @Override
    public void setTasksProgrammer(TaskProgrammer programmer) {
        this.programmer = programmer;
    }

    @Override
    public void sendRequest(String name) {
        programmer.execution(name);
    }
}