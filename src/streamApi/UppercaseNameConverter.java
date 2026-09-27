package streamApi;
import java.util.*;
import java.util.stream.Stream;

public class UppercaseNameConverter {
	public static void main(String[] args) {
		List<String> words=List.of("sanskruti","samikssha","om");
		Stream<String> result=words.stream()
				.map(String::toUpperCase);
		result.forEach(System.out::println);
	}

}
