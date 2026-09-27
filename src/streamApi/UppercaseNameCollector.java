package streamApi;
import java.util.*;

public class UppercaseNameCollector {
	public static void main(String[] args) {
		List<String> data=List.of("rahul",
				"amit",
				"neha",
				"priya");
		
		List<String>result = data.stream()
		.map(String::toUpperCase)
		.toList();
		System.out.println(result);
		
	}

}
