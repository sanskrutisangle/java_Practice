package queueCollection;
import java.util.PriorityQueue;
import java.util.Comparator;


public class MaxPriorityQueue {
	public static void main(String[] args) {
		PriorityQueue<Integer> queue =
                new PriorityQueue<>(Comparator.reverseOrder());

        // Add elements
        queue.offer(10);
        queue.offer(50);
        queue.offer(30);
        queue.offer(20);
        queue.offer(40);
        
        while (!queue.isEmpty()) {
            System.out.println(queue.poll());
        }
	}

}
