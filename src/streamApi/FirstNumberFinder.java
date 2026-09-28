package streamApi;
import java.util.*;

public class FirstNumberFinder {
	public static void main(String[] args) {
		List<Integer> data=List.of(12,89,45,90,24,24,68,78,68,10,10);
		Optional<Integer>result=data.stream()
		.filter(n->n>50)
		.findAny();
		System.out.println(result);
		
		
	}

}
