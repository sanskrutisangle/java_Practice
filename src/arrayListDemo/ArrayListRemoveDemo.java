package arrayListDemo;

import java.util.ArrayList;

public class ArrayListRemoveDemo {
	public static void main(String[] args) {
		ArrayList<Integer> numbers=new ArrayList<>();
		numbers.add(1);
		numbers.add(2);
		numbers.add(3);
		numbers.add(4);
		numbers.add(5);
		numbers.add(6);
		
		//remove by index
		numbers.remove(1);
		//remove particular object 
		numbers.remove(Integer.valueOf(1));
		
		for(Integer n:numbers) {
			System.out.println(n);
		}
		
	}
	

}
