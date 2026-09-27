package streamApi;
import java.util.*;

public class LongNameFilter {
	public static void main(String[] args) {
		List<String> name=List.of("sanskruti","samiksha","om");
		name.stream()
		.filter(s->s.length()>5)
		.forEach(System.out::println);
	}

}
