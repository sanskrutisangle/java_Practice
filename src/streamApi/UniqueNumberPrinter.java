package streamApi;
import java.util.*;

public class UniqueNumberPrinter {
	public static void main(String[] args) {
		List<Integer> data=List.of(12,89,45,90,24,24,68,78,68,10,10);
		data.stream()
		.distinct()
		.forEach(System.out::println);
	}

}
