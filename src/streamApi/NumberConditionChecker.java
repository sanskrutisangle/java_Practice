package streamApi;
import java.util.*;

public class NumberConditionChecker {
	public static void main(String[] args) {
		List<Integer> data=List.of(12,-89,45,90,20,24,68,78,68,10,10);
		boolean result=data.stream()
					.anyMatch(n->n>100);
		
		System.out.println(result);
		
		boolean posi=data.stream()
				.allMatch(n->n>0);
		System.out.println(posi);
	}

}
