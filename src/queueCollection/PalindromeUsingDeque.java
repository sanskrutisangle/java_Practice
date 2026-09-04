package queueCollection;
import java.util.ArrayDeque;
import java.util.Deque;


public class PalindromeUsingDeque {
	public static void main(String[] args) {
		
		String str="madam";
		 Deque<Character> deque = new ArrayDeque<>();
		 
		 for(char s:str.toCharArray()) {
			 deque.addLast(s);
		 }
		 boolean isPalindrome = true;

		 while(deque.size()>1) {
			 char first = deque.removeFirst();
	            char last = deque.removeLast();
	            if(first!=last) {
	            	isPalindrome = false;
	                break;
	            }
		 }
		 if (isPalindrome) {
	            System.out.println(str + " is a Palindrome");
	        } else {
	            System.out.println(str + " is not a Palindrome");
	        }
	}

}
