package streamApi;
import java.util.*;

public class NumberGreaterThanFifty {
	public static void main(String[] args) {
		List<Integer> number=List.of(21,45,23,90,67,54);//List.of() creates an unmodifiable list.
		
		number.stream()
		.filter(n->n>50)
		.sorted()
		.forEach(System.out::println);
		
			
		
		
	}

}
