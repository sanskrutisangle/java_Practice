package LinkedList;

import java.util.LinkedList;

public class LinkedListMiddleElement {
	public static void main(String[] args) {
		LinkedList<Integer> list = new LinkedList<>();

		 list.add(10);
	        list.add(20);
	        list.add(30);
	        list.add(40);
	        list.add(50);
        
        int len=list.size();
        
        int mid=len/2;
        
        System.out.println(list.get(mid));
	}

}
