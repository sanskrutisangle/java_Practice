package LinkedList;

import java.util.LinkedList;
import java.util.Iterator;

public class LinkedListReverse {
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
        
        
        Iterator<Integer> intr=list.descendingIterator();
        while(intr.hasNext()) {
        	System.out.print(intr.next() + " ");
        }
        
        System.out.println();
        
        LinkedList<Integer> reverse = new LinkedList<>();
        
        for(int i=list.size()-1;i>=0;i--) {
        	reverse.add(list.get(i));
        }
        System.out.println(reverse);
	}

}
