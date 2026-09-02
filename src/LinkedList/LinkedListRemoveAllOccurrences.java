package LinkedList;

import java.util.LinkedList;

public class LinkedListRemoveAllOccurrences {
	public static void main(String[] args) {
		LinkedList<Integer> list = new LinkedList<>();

        list.add(100);
        list.add(21);
        list.add(21);
        list.add(233);
        list.add(41);
        list.add(21);
        list.add(5);
        list.add(21);
        
      /*  
        int remove = 10;

        list.removeIf(num -> num == remove);
*/
        /*
         * list.get(i) gives you an Integer, and remove is an int.

Java automatically converts the Integer to int (unboxing), so it compares the actual numbers.
         */
        int remove =21;
        for(int i=0;i<list.size();i++) {
        	if(list.get(i)==remove) {
        		list.remove(i);
        		i--;
        	}
        }
        System.out.println(list);
	}

}
