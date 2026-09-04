package queueCollection;
import java.util.PriorityQueue;
import java.util.Collections;

public class KLargestElements {

    public static void main(String[] args) {

        int[] array = {10, 5, 20, 8, 30, 15};
        int k = 3;

        // Min PriorityQueue
        PriorityQueue<Integer> pq = new PriorityQueue<>();

        for (int num : array) {

            pq.offer(num);

            if (pq.size() > k) {
                pq.poll();
            }
        }

        // Max PriorityQueue for descending output
        PriorityQueue<Integer> result =
                new PriorityQueue<>(Collections.reverseOrder());

        result.addAll(pq);

        while (!result.isEmpty()) {
            System.out.print(result.poll() + " ");
        }
    }
}