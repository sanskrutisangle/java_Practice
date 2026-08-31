package arrayListDemo;
import java.util.ArrayList;

public class ReverseArrayListDemo {
	
		public static void main(String[] args) {

	        ArrayList<Integer> numbers = new ArrayList<>();

	        numbers.add(10);
	        numbers.add(20);
	        numbers.add(30);
	        numbers.add(40);
	        numbers.add(50);

	        int n = numbers.size();
	        
	        for(int i=0;i< n/2;i++) {
	        	int temp=numbers.get(i);
	        	numbers.set(i,numbers.get(n-1-i));
	        	numbers.set(n-1-i,temp);
	        }
	        System.out.println(numbers);

	}

}
