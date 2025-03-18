package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PriorityQueueTest {

    @Test
    void testInsertAndRemoveHighestPriority() {
        PriorityQueue<Job> pq = new PriorityQueue<>();
        Job job1 = new Job("Job1", 5);
        Job job2 = new Job("Job2", 10);
        Job job3 = new Job("Job3", 1);

        pq.insert(job1);
        pq.insert(job2);
        pq.insert(job3);

        assertEquals(job2, pq.removeHighestPriority()); // job2 has the highest priority
        assertEquals(job1, pq.removeHighestPriority()); // job1 comes next
        assertEquals(job3, pq.removeHighestPriority()); // job3 has the lowest priority
    }

    @Test
    void testIsEmpty() {
        PriorityQueue<Job> pq = new PriorityQueue<>();
        assertTrue(pq.isEmpty());

        pq.insert(new Job("Job1", 5));
        assertFalse(pq.isEmpty());

        pq.removeHighestPriority();
        assertTrue(pq.isEmpty());
    }
}