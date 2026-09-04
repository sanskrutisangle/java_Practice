package queueCollection;
import java.util.LinkedList;
import java.util.Queue;


public class MinMaxInQueue {
	public static void main(String[] args) {
		Queue<Integer> queue = new LinkedList<>();

        queue.offer(40);
        queue.offer(10);
        queue.offer(50);
        queue.offer(20);
        queue.offer(30);

        System.out.println("Queue: " + queue);
        
        int min=queue.peek();
        int max=queue.peek();
        
        while(!queue.isEmpty()) {
        	int element=queue.poll();
        	if(element<min) {
        		min=element;
        	}
        	
        	if(element>max) {
        		max=element;
        	}
        	
        	        }
        System.out.println("Minimum = " + min);
        System.out.println("Maximum = " + max);
	}

}
