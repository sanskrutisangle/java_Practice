package queueCollection;

import java.util.ArrayDeque;
import java.util.Deque;

public class StackUsingArrayDeque {

    public static void main(String[] args) {

        Deque<Integer> stack = new ArrayDeque<>();

        // Push elements
        stack.push(10);
        stack.push(20);
        stack.push(30);

        System.out.println("Stack: " + stack);

        // Pop top element
        System.out.println("Popped: " + stack.pop());

        // Peek top element
        System.out.println("Top element: " + stack.peek());

        System.out.println("Stack after pop: " + stack);
    }
}