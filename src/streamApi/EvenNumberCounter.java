package streamApi;

import java.util.*;
import java.util.stream.Collectors;

public class EvenNumberCounter {
	
		public static void main(String[] args) {
			List<Integer> data=List.of(12,89,45,90,24,24,68,78,68,10,10);
//			long result=data.stream()
//			.filter(n->n%2==0)//return stream<Integer>
//			.count();//return long 
//			
//			System.out.println(result);
//			
			
			List<Integer> result1=data.stream()
					.filter(n->n%2==0)
					.collect(Collectors.toList());
			
			System.out.println(result1);
			
	}

}
