package LinkedList;

import java.util.LinkedList;

public class LinkedListMinMax {
	public static void main(String[] args) {
		LinkedList<Integer> list=new LinkedList<>();
		
		list.add(100);
		list.add(21);
		list.add(233);
		list.add(41);
		list.add(5);
		int max=list.get(0);
		int min=list.get(0);
		
		for(int i=0;i<list.size();i++) {
			if (list.get(i) > max) {
                max = list.get(i);
            }

            if (list.get(i) < min) {
                min = list.get(i);
            }
        }

        System.out.println("Max : " + max);
        System.out.println("Min : " + min);
				
	}
}
