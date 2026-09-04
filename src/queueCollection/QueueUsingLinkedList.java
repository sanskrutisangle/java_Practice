package queueCollection;
import java.util.LinkedList;
import java.util.Queue;

public class QueueUsingLinkedList {
	public static void main(String[] args) {
		//Create a LinkedList object that will work as a Queue of Integer values, and store its reference in the variable queue.
		Queue<Integer> queue=new LinkedList<>();
		
		// Add elements
        queue.offer(10);
        queue.offer(20);
        queue.offer(30);
        
        System.out.println("Peek: " + queue.peek());
        System.out.println("Poll: " + queue.poll());
        System.out.println("Queue: " + queue);
	}

}
