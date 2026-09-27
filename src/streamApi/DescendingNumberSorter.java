package streamApi;
import java.util.*;

public class DescendingNumberSorter {
	public static void main(String[] args) {
		List<Integer> data=List.of(12,89,45,90,24,24,68,78,68,10,10);
		data.stream()
		.distinct()
		//.sorted(Comparator.reverseOrder())
		.sorted((a,b)->b-a)//means compare b with a, so the bigger number comes first.
		.forEach(System.out::println);
		
	}

}
