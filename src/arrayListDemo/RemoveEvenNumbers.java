package arrayListDemo;
import java.util.ArrayList;
import java.util.Iterator;

public class RemoveEvenNumbers {
	public static void main(String[] args) {

        ArrayList<Integer> numbers = new ArrayList<>();

        numbers.add(10);
        numbers.add(15);
        numbers.add(20);
        numbers.add(25);
        numbers.add(30);
        numbers.add(35);
        numbers.add(40);
        
        Iterator<Integer> intr = numbers.iterator();
        while(intr.hasNext()) {
        	int num=intr.next();
        	
        	if(num%2==0) {
        		intr.remove();
        	}
        }
        
        System.out.println(numbers);
        
	}

}
