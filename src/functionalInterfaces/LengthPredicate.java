package functionalInterfaces;
import java.util.function.*;

public class LengthPredicate {
	public static void main(String[] args) {
		Predicate<String> check=(word)->word.length()>5;
		
		System.out.println(check.test("hi"));
		System.out.println(check.test("sanskruti"));
	}

}
