package optionalClass;
import java.util.*;

public class OptionalAgeValidator {
	public static void main(String[] args) {
		Optional<Integer> age =
                Optional.of(10);
		
		Optional<Integer> check=age.filter(a->a>18);
		System.out.println(check);
		
	}

}
