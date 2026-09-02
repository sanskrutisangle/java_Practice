package LinkedList;

import java.util.LinkedList;

public class LinkedListInsertAtIndex {
	public static void main(String[] args) {
		LinkedList<Integer> list=new LinkedList<>();
		
		list.add(100);
		list.add(21);
		list.add(233);
		list.add(41);
		list.add(5);
		
		list.add(3,102);
		System.out.println(list);
}
}
