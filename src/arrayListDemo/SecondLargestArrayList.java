package arrayListDemo;
import java.util.ArrayList;

public class SecondLargestArrayList {
	 public static void main(String[] args) {

	        ArrayList<Integer> numbers = new ArrayList<>();

	        numbers.add(10);
	        numbers.add(50);
	        numbers.add(20);
	        numbers.add(80);
	        numbers.add(40);
	        numbers.add(70);

	        int largest = Integer.MIN_VALUE;
	        int secondLargest = Integer.MIN_VALUE;
	        
	        for (int i = 0; i < numbers.size(); i++) {
	        	int current = numbers.get(i);
	        	
	        	if(current> largest) {
	        		secondLargest=largest;
	        		largest=current;
	        	}else if(current > secondLargest && current!=largest) {
	        		secondLargest=current;
	        	}
	        }
	        System.out.println(secondLargest);
	 }

}
