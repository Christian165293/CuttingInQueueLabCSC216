package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class JobTest {

    @Test
    void testJobCreation() {
        Job job = new Job("TestJob", 5);
        assertEquals("TestJob", job.getName());
        assertEquals(5, job.getPriority());
    }

    @Test
    void testJobComparison() {
        Job job1 = new Job("Job1", 5);
        Job job2 = new Job("Job2", 10);
        assertTrue(job1.compareTo(job2) < 0); // job1 has lower priority than job2
        assertTrue(job2.compareTo(job1) > 0); // job2 has higher priority than job1
        assertEquals(0, job1.compareTo(new Job("Job3", 5))); // Same priority
    }

    @Test
    void testJobExecution() {
        Job job = new Job("TestJob", 5);
        job.execute();
    }
}