package queueCollection;
import java.util.LinkedList;
import java.util.Queue;

public class QueueOperations {
	public static void main(String[] args) {
		Queue<Integer>queue =new LinkedList<>();
		
		 queue.offer(10);
	        queue.offer(20);
	        queue.offer(30);
	              
	        queue.add(100);
	        queue.offer(30);
	        System.out.println("Queue: " + queue);
	        
	        queue.remove(100);
	        System.out.println("Queue: " + queue);
	        
	        queue.poll();
	        System.out.println("Queue: " + queue);
	        
	        System.out.println(queue.element());
	        System.out.println(queue.peek());
	        System.out.println(queue.isEmpty());
	        System.out.println(queue.size());
	}

}
