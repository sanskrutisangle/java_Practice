package optionalClass;
import java.util.*;

public class OptionalStringLength {
	public static void main(String[] args) {
		Optional<String> name =Optional.of("sanskruti");
		
		Optional<Integer> result=name.map(String::length)
		.filter(len->len>4);
		
		System.out.println(result);
		
		
	}

}
