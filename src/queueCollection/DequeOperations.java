package queueCollection;
import java.util.ArrayDeque;
import java.util.Deque;

public class DequeOperations {

    public static void main(String[] args) {

        Deque<Integer> deque = new ArrayDeque<>();

        // 1. addFirst()
        deque.addFirst(20);
        System.out.println("After addFirst(20): " + deque);

        // 2. addLast()
        deque.addLast(30);
        System.out.println("After addLast(30): " + deque);

        // 3. offerFirst()
        deque.offerFirst(10);
        System.out.println("After offerFirst(10): " + deque);

        // 4. offerLast()
        deque.offerLast(40);
        System.out.println("After offerLast(40): " + deque);

        // Current Deque
        System.out.println("Deque: " + deque);

        // 5. peekFirst()
        System.out.println("peekFirst(): " + deque.peekFirst());

        // 6. peekLast()
        System.out.println("peekLast(): " + deque.peekLast());

        // 7. pollFirst()
        System.out.println("pollFirst(): " + deque.pollFirst());
        System.out.println("After pollFirst(): " + deque);

        // 8. pollLast()
        System.out.println("pollLast(): " + deque.pollLast());
        System.out.println("After pollLast(): " + deque);

        // 9. removeFirst()
        System.out.println("removeFirst(): " + deque.removeFirst());
        System.out.println("After removeFirst(): " + deque);

        // 10. removeLast()
        System.out.println("removeLast(): " + deque.removeLast());
        System.out.println("After removeLast(): " + deque);
    }
}