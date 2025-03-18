package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MaxHeapTest {

    @Test
    void testInsertAndRemoveMax() {
        MaxHeap<Integer> maxHeap = new MaxHeap<>();
        maxHeap.insert(10);
        maxHeap.insert(5);
        maxHeap.insert(20);

        assertEquals(20, maxHeap.removeMax());
        assertEquals(10, maxHeap.removeMax());
        assertEquals(5, maxHeap.removeMax());
    }

    @Test
    void testIsEmpty() {
        MaxHeap<Integer> maxHeap = new MaxHeap<>();
        assertTrue(maxHeap.isEmpty());

        maxHeap.insert(10);
        assertFalse(maxHeap.isEmpty());

        maxHeap.removeMax();
        assertTrue(maxHeap.isEmpty());
    }

    @Test
    void testHeapifyUpAndDown() {
        MaxHeap<Integer> maxHeap = new MaxHeap<>();
        maxHeap.insert(10);
        maxHeap.insert(5);
        maxHeap.insert(20);
        maxHeap.insert(15);

        assertEquals(20, maxHeap.removeMax());
        assertEquals(15, maxHeap.removeMax());
        assertEquals(10, maxHeap.removeMax());
        assertEquals(5, maxHeap.removeMax());
    }
}