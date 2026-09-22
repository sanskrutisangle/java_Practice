package functionalInterfaces;
import java.util.function.*;

public class DemoPredicate {
	public static void main(String[] args) {
		Predicate<Integer> isEven=n->n%2==0;
		
		System.out.println(isEven.test(5));
	}
}
