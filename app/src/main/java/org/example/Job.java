package org.example;

public class Job implements Comparable<Job> {
    private final String name;
    private final int priority;

    Job(String name, int priority) {
        this.name = name;
        this.priority = priority;
    }

    void execute() {
        System.out.println("Running the job with name " + this.name + " and priority " + this.priority);
    }

    String getName() {
        return this.name;
    }

    int getPriority() {
        return this.priority;
    }

    @Override
    public int compareTo(Job other) {
        return Integer.compare(this.priority, other.priority); // Higher priority comes first
    }
}
