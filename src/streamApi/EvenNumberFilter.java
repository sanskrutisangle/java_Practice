package streamApi;
import java.util.*;

public class EvenNumberFilter {
	public static void main(String[] args) {
		List<Integer> num =new ArrayList(List.of(12,34,24,11,78,99,56,43,33));//List.of() first creates an unmodifiable list, but then ArrayList copies those values into a new, modifiable list.
		
		num.stream().filter(n->n%2==0).forEach(System.out::println);
		
		
	}

}
