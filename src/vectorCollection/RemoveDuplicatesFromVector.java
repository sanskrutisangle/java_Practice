package vectorCollection;
import java.util.Vector;

public class RemoveDuplicatesFromVector {
	public static void main(String[] args) {
		Vector<Integer> numbers = new Vector<>();

        numbers.add(10);
        numbers.add(20);
        numbers.add(10);
        numbers.add(30);
        numbers.add(20);
        numbers.add(40);

        Vector<Integer> unique = new Vector<>();
        
        for(int i=0;i<numbers.size();i++) {
        	if(!unique.contains(numbers.get(i))) {
        		unique.add(numbers.get(i));
        	}
        }
        System.out.println("Original Vector: " + numbers);
        System.out.println("After Removing Duplicates: " + unique);
	}

}
