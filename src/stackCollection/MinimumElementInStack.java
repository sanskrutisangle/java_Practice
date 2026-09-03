package stackCollection;
import java.util.Stack;

public class MinimumElementInStack {
	public static void main(String[] args) {
		Stack<Integer> stack = new Stack<>();

        stack.push(40);
        stack.push(20);
        stack.push(30);
        stack.push(10);
        stack.push(50);
        
        int min=stack.peek();
        
        for(int i=0;i<stack.size();i++) {
        	if(stack.get(i)<min) {
        		min=stack.get(i);
        	}
        }
        System.out.println("Stack: " + stack);
        System.out.println("Minimum = " + min);
	}

}
