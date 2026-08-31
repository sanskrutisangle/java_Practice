package arrayListDemo;

import java.util.ArrayList;

public class ArrayListMinMaxDemo {
		public static void main(String[] args) {
			ArrayList<Integer> numbers=new ArrayList<>();
			numbers.add(10);
			numbers.add(200);
			numbers.add(32);
			numbers.add(41);
			numbers.add(55);
			numbers.add(6);
			
			int max=numbers.get(0);
			int min=numbers.get(0);
			
			for(int i=1;i<numbers.size();i++) {
				if(numbers.get(i) > max) {
					System.out.println("max : "+(max=numbers.get(i)));
				}
				
				if(numbers.get(i) < min) {
					System.out.println("min : "+(min=numbers.get(i)));
				}
			}
			
		}
}
