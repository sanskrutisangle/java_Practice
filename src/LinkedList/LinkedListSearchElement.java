package LinkedList;

import java.util.LinkedList;

public class LinkedListSearchElement {
	public static void main(String[] args) {
	LinkedList<Integer> list=new LinkedList<>();
			
			list.add(100);
			list.add(21);
			list.add(233);
			list.add(41);
			list.add(5);
			
			int search=90;
			boolean result=false;
			
			for(int i=0;i<list.size();i++) {
				if(list.get(i)==search) {
					result=true;
					break;
			}
							
	}
			if(result) {
				System.out.println("Found");
	        } else {
	            System.out.println("Not Found");
	        }

	}
}
