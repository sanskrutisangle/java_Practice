package LinkedList;
import java.util.LinkedList;

public class LinkedListNthFromEnd {
	public static void main(String[] args) {
		 LinkedList<Integer> list = new LinkedList<>();

	        list.add(10);
	        list.add(20);
	        list.add(30);
	        list.add(40);
	        list.add(50);
	        
	        int n=2;
	        
	        int slow=0;
	        int fast=0;
	        
	        
	        for(int i=0;i<n;i++) {
	        	fast++;
	        }
	        
	        while(fast<list.size()) {
	        	slow++;
	        	fast++;
	        	
	        	
	        }
	        System.out.println(list.get(slow));

	        
	}
}
