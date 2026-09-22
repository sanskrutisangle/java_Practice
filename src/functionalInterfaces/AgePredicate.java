package functionalInterfaces;
import java.util.function.*;
public class AgePredicate {
	public static void main(String[] args) {
		Predicate<Integer> checkAge=(age)->age>18;
		
		System.out.println(checkAge.test(2));
		System.out.println(checkAge.test(56));
	}

}
