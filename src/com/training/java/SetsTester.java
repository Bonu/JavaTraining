package com.training.java;

import java.util.Set;
import java.util.TreeSet;

public class SetsTester {

    public static void main(String[] args) {
        Set<Task> allTasks = new TreeSet<>();
        allTasks.add(new CodingTask("Rosa technique"));
    }

}


class Task {
    String taskName;
    int durationMinutes;
}

class CodingTask extends Task {
    String spec;

    public CodingTask(String spec) {
        this.spec = spec;
    }

    @Override
    public String toString() {
        return "CodingTask{" +
                "taskName='" + taskName + '\'' +
                ", durationMinutes=" + durationMinutes +
                ", spec='" + spec + '\'' +
                '}';
    }
}