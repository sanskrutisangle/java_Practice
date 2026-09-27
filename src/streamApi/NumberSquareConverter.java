package streamApi;
import java.util.*;
import java.util.stream.Stream;

public class NumberSquareConverter {
	public static void main(String[] args) {
		List<Integer> nums=List.of(1,2,3,4,5);
	List<Integer>result  =nums.stream()//convert to stream
		.map(n->n*2)//return to stream
		.toList();//convert stream to list
		
	System.out.println(result);
	
	Stream<Integer> result1=nums.stream().map(n->n*2);
	
	result1.forEach(System.out::println);
	
	
	}

}
