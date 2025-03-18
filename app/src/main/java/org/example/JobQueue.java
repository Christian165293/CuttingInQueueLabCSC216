package org.example;

public class JobQueue {
    private final PriorityQueue<Job> priorityQueue;

    public JobQueue() {
        priorityQueue = new PriorityQueue<>();
    }

    // Insert a job into the queue
    public void insert(Job job) {
        priorityQueue.insert(job);
    }

    // Run the highest priority job and remove it from the queue
    public void runHighestPriority() {
        if (!priorityQueue.isEmpty()) {
            Job job = priorityQueue.removeHighestPriority();
            job.execute();
        } else {
            System.out.println("No jobs to run.");
        }
    }
}
