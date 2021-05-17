package edu.pong.administrator;


import edu.pong.filters.Filter;
import edu.pong.targets.Target;

import java.util.LinkedList;
import java.util.List;
import java.util.Optional;

public class Tasks {
    private List<Filter> tasks = new LinkedList<>();

    private Optional<Target> target;

    public List<Filter> getTasks() {
        return this.tasks;
    }

    public Optional<Target> getTarget() {
        return this.target;
    }

    public void setTarget(Target target) {
        this.target = Optional.ofNullable(target);
    }

    public void addTask(Filter filter) {
        getTasks().add(filter);
    }

    public void execution(String name) {

        getTasks().forEach(item -> item.execution(name));
        if (getTarget().isPresent()) {
            getTarget().get().execution(name);
        }
        else{
            System.out.println("no available");
        }
    }
}