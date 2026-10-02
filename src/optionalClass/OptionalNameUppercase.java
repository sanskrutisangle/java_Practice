package optionalClass;
import java.util.*;

public class OptionalNameUppercase {
	public static void main(String[] args) {
		Optional<String> name =Optional.of("sanskruti");
		Optional<String> upper=name.map(String::toUpperCase);
		System.out.println(upper);
		
	}
}
