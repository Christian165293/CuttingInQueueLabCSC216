package org.example;

import java.util.ArrayList;
import java.util.List;

public class MaxHeap<T extends Comparable<T>> {
    private final List<T> heap;

    public MaxHeap() {
        heap = new ArrayList<>();
    }

    // Insert a new element into the heap
    public void insert(T item) {
        heap.add(item); // Add to the end of the list
        int currentIndex = heap.size() - 1; // Index of the newly added item
        heapifyUp(currentIndex); // Restore the heap property
    }

    // Remove and return the maximum element (root of the heap)
    public T removeMax() {
        if (heap.isEmpty()) {
            throw new IllegalStateException("Heap is empty");
        }

        T max = heap.getFirst(); // The root is the maximum element
        T lastItem = heap.removeLast(); // Remove the last element

        if (!heap.isEmpty()) {
            heap.set(0, lastItem); // Move the last element to the root
            heapifyDown(); // Restore the heap property
        }

        return max;
    }

    public boolean isEmpty() {
        return heap.isEmpty();
    }

    // Restore the heap property by heapifying up
    private void heapifyUp(int index) {
        while (index > 0) {
            int parentIndex = (index - 1) / 2; // Parent index
            if (heap.get(index).compareTo(heap.get(parentIndex)) > 0) {
                swap(index, parentIndex); // Swap if child is greater than parent
                index = parentIndex; // Move up to the parent
            } else {
                break; // Stop if the heap property is satisfied
            }
        }
    }

    // Restore the heap property by heapifying down
    private void heapifyDown() {
        int index = 0;
        int size = heap.size();
        while (index < size) {
            int leftChildIndex = 2 * index + 1; // Left child index
            int largestIndex = getLargestIndex(index, leftChildIndex, size);

            // If the largest is not the current node, swap and continue
            if (largestIndex != index) {
                swap(index, largestIndex);
                index = largestIndex;
            } else {
                break; // Stop if the heap property is satisfied
            }
        }
    }

    private int getLargestIndex(int index, int leftChildIndex, int size) {
        int rightChildIndex = 2 * index + 2; // Right child index
        int largestIndex = index; // Assuming the current node is the largest

        // Check if the left child is larger
        if (leftChildIndex < size && heap.get(leftChildIndex).compareTo(heap.get(largestIndex)) > 0) {
            largestIndex = leftChildIndex;
        }

        // Check if the right child is larger
        if (rightChildIndex < size && heap.get(rightChildIndex).compareTo(heap.get(largestIndex)) > 0) {
            largestIndex = rightChildIndex;
        }
        return largestIndex;
    }

    private void swap(int i, int j) {
        T temp = heap.get(i);
        heap.set(i, heap.get(j));
        heap.set(j, temp);
    }

}
