package LinkedList;

import java.util.LinkedList;

public class LinkedListRemoveDuplicates {
	public static void main(String[] args) {
		LinkedList<Integer> list = new LinkedList<>();

        list.add(100);
        list.add(100);
        list.add(21);
        list.add(21);
        list.add(233);
        list.add(41);
        list.add(21);
        list.add(5);
        list.add(21);
        
        for(int i=0;i<list.size();i++) {
        	
        	for(int j=i+1;j<list.size();j++) {
        		if(list.get(j).equals(list.get(i))) {
        			list.remove(j);
        			j--;
        		}
        	}
        }
        
        System.out.println(list);
	}

}
