package arrayListDemo;
import java.util.ArrayList;

public class ArrayListBasicDemo {
	
	public static void main(String[] args) {
		ArrayList<Integer> numbers=new ArrayList<>();
		numbers.add(1);
		numbers.add(2);
		numbers.add(3);
		numbers.add(4);
		numbers.add(5);
		numbers.add(6);
		
		for(int i=0;i<numbers.size();i++) {
			System.out.println(numbers.get(i));
		}
		
		for(Integer n : numbers) {
			System.out.println(n);
		}
		
		System.out.println("size of the arraylist : "+numbers.size());
		
	}
	
}
