package edu.pong.administrator;

import edu.pong.filters.Filter;
import edu.pong.targets.Target;

import java.util.Optional;


public class TasksProgrammer {
    private Tasks tasks;

    public TasksProgrammer(Target target) {
        tasks = new Tasks();
        tasks.setTarget(target);
    }

    public Tasks getTasks() {
        return this.tasks;
    }

    public void setTasks(Filter task) {
        getTasks().addTask(task);
    }

    public void execution(String name) {
        tasks.execution(name);
    }
}