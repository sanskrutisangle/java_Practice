package methodReference;
import java.util.function.*;
import java.util.*;

public class ArrayListCreator {
	public static void main(String[] args) {
		
		Supplier<ArrayList<Integer>> dataAdd=()->new ArrayList<>();
		
		ArrayList<Integer> num=dataAdd.get();
		
		num.add(1);
		num.add(2);
		num.add(3);
		
		num.forEach(System.out::println);
		
		
		
		Supplier<ArrayList<String>> creator=ArrayList::new;//"Use the ArrayList constructor to create a new object."
		//creator will give me an ArrayList<String> when I call get().
		ArrayList<String> data=creator.get();
		
		data.add("java");
		data.add("python");
		data.add("SQL");
		
		data.forEach(System.out::println);
		
		
	}

}
