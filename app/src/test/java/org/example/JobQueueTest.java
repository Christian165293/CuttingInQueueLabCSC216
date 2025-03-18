package org.example;

import org.junit.jupiter.api.Test;

class JobQueueTest {

    @Test
    void testInsertAndRunHighestPriority() {
        JobQueue jobQueue = new JobQueue();
        Job job1 = new Job("Job1", 5);
        Job job2 = new Job("Job2", 10);
        Job job3 = new Job("Job3", 1);

        jobQueue.insert(job1);
        jobQueue.insert(job2);
        jobQueue.insert(job3);

        jobQueue.runHighestPriority(); // Should run job2
        jobQueue.runHighestPriority(); // Should run job1
        jobQueue.runHighestPriority(); // Should run job3
    }

    @Test
    void testRunOnEmptyQueue() {
        JobQueue jobQueue = new JobQueue();
        jobQueue.runHighestPriority(); // Should print "No jobs to run."
    }
}