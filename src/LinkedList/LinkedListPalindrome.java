package LinkedList;
import java.util.LinkedList;


public class LinkedListPalindrome {
	public static void main(String[] args) {
		LinkedList<Integer> list = new LinkedList<>();

        list.add(10);
        list.add(20);
        list.add(30);
        list.add(20);
        list.add(10);
        
        boolean palindrome = true;

        for (int i = 0; i < list.size() / 2; i++) {
        	if(!list.get(i).equals(list.get(list.size()-1-i))) {
        		palindrome = false;
                break;
        	}
        }
        if (palindrome) {
            System.out.println("Palindrome");
        } else {
            System.out.println("Not Palindrome");
        }

	}

}
