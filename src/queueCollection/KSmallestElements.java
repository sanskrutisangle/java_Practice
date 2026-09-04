package queueCollection;

import java.util.PriorityQueue;
import java.util.Collections;

public class KSmallestElements {

    public static void main(String[] args) {

        int[] array = {10, 5, 20, 8, 30, 15};
        int k = 3;

        // Max PriorityQueue
        PriorityQueue<Integer> pq =
                new PriorityQueue<>(Collections.reverseOrder());

        // Process every element
        for (int num : array) {

            pq.offer(num);

            // Keep only K smallest elements
            if (pq.size() > k) {
                pq.poll();
            }
        }

        // Print elements in ascending order
        PriorityQueue<Integer> result = new PriorityQueue<>(pq);

        while (!result.isEmpty()) {
            System.out.print(result.poll() + " ");
        }
    }
}