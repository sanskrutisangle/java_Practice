package queueCollection;
import java.util.LinkedList;
import java.util.Queue;

public class TaskScheduling {
	public static void main(String[] args) {
		Queue<String> tasks = new LinkedList<>();

        // Add tasks
        tasks.offer("A");
        tasks.offer("B");
        tasks.offer("C");
        tasks.offer("D");
        tasks.offer("E");

        System.out.println("Tasks: " + tasks);
        
        while(!tasks.isEmpty()) {
        	// View the task to be processed
            System.out.println("Processing task: " + tasks.peek());

            // Remove the processed task
            tasks.poll();

            System.out.println("Remaining tasks: " + tasks);
        }
        System.out.println("All tasks completed.");
	}

}
