package stackCollection;
import java.util.Stack;

public class StackOperations {
	public static void main(String[] args) {
		Stack<Integer> stack = new Stack<>();
		
		// push()
        stack.push(10);
        System.out.println("After push(10): " + stack);

        stack.push(20);
        System.out.println("After push(20): " + stack);

        stack.push(30);
        System.out.println("After push(30): " + stack);

        // pop()
        System.out.println("pop(): " + stack.pop());
        System.out.println("Stack after pop: " + stack);

        // peek()
        System.out.println("peek(): " + stack.peek());

        // search()
        System.out.println("search(10): " + stack.search(10));
        
		System.out.println("isEmpty(): " + stack.isEmpty());
		

	}

}
