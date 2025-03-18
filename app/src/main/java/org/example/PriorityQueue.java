package org.example;

public class PriorityQueue<T extends Comparable<T>> {
    private final MaxHeap<T> maxHeap;

    public PriorityQueue() {
        maxHeap = new MaxHeap<>();
    }

    // Insert an item into the priority queue
    public void insert(T item) {
        maxHeap.insert(item);
    }

    // Remove and return the highest priority item
    public T removeHighestPriority() {
        return maxHeap.removeMax();
    }

    // Check if the priority queue is empty
    public boolean isEmpty() {
        return maxHeap.isEmpty();
    }
}
