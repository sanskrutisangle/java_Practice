package queueCollection;
import java.util.PriorityQueue;


public class MinPriorityQueue {
	public static void main(String[] args) {
		PriorityQueue<Integer> queue = new PriorityQueue<>();

        // Add elements
        queue.offer(50);
        queue.offer(10);
        queue.offer(30);
        queue.offer(20);
        queue.offer(40);

        System.out.println("Priority Queue: " + queue);
        while(!queue.isEmpty()) {
        	System.out.println(queue.poll());
        }
	}

}
