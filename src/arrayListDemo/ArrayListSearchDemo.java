package arrayListDemo;

import java.util.ArrayList;

public class ArrayListSearchDemo {
	public static void main(String[] args) {
		ArrayList<Integer> numbers=new ArrayList<>();
		numbers.add(1);
		numbers.add(2);
		numbers.add(3);
		numbers.add(4);
		numbers.add(5);
		numbers.add(6);
		
		Integer search=0;
		
		
			if(numbers.contains(search)) {
				System.out.println("element is found");
			}else {
				System.out.println("element is not found");
			}
		}
	}


