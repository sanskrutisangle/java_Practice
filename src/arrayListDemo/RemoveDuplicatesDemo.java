package arrayListDemo;
import java.util.ArrayList;

public class RemoveDuplicatesDemo {
	public static void main(String[] args) {
		ArrayList<Integer> numbers = new ArrayList<>();

        numbers.add(10);
        numbers.add(20);
        numbers.add(10);
        numbers.add(30);
        numbers.add(20);
        numbers.add(40);
        numbers.add(30);
        
        ArrayList<Integer> unique = new ArrayList<>();
        for(int i=0;i<numbers.size();i++) {
        	if(!unique.contains(numbers.get(i))) {
        		unique.add(numbers.get(i));
        	}
        }
        System.out.println(unique);//Because ArrayList overrides the toString() method. Java internally does something similar to: System.out.println(unique.toString());
	}

}
