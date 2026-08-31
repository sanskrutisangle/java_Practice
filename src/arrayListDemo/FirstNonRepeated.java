package arrayListDemo;
import java.util.ArrayList;

public class FirstNonRepeated {
	public static void main(String[] args) {
		ArrayList<Integer> numbers = new ArrayList<>();

        numbers.add(10);
        numbers.add(20);
        numbers.add(10);
        numbers.add(30);
        numbers.add(20);
        numbers.add(40);

        for (int i = 0; i < numbers.size(); i++) {
        	int current=numbers.get( i);
        	int count=0;
        	for (int j = 0; j < numbers.size(); j++) {
        		if(numbers.get(j).equals(current)) {
        			count++;
        		}
        	}
        	 if (count == 1) {
                 System.out.println("First non-repeated element: " + current);
                 break;
             }
        }
	}

}
