package queueCollection;
import java.util.Queue;
import java.util.LinkedList;
import java.util.Stack;

public class ReverseQueue {
	public static void main(String[] args) {
		Queue<Integer> queue = new LinkedList<>();

        // Add elements
        queue.offer(10);
        queue.offer(20);
        queue.offer(30);
        queue.offer(40);
        queue.offer(50);

        System.out.println("Original Queue: " + queue);

        // Create Stack
        Stack<Integer> stack = new Stack<>();
        
        while(!queue.isEmpty()) {
        	stack.push(queue.poll());
        }
        
        while(!stack.isEmpty()) {
        	queue.offer(stack.pop());
        }
        
        System.out.println("Reversed Queue: " +queue);
	}

}
