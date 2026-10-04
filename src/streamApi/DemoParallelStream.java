package streamApi;
import java.util.*;

public class DemoParallelStream {
	public static void main(String[] args) {
		List<Integer> data=List.of(1,2,3,4,5,6,7,8);
		
//		data.parallelStream()
//		.forEach(n->{
//			System.out.println(n+"- "+Thread.currentThread().getName());
//			
//		});//order not maintain
		
//		System.out.println();
		
//		data.stream()//convert existing stream into parallel stream
//		.parallel()
//		.forEachOrdered(System.out::println);
		
		
		//Parallel Stream Uses Multiple Threads
		
//		List<Integer>result=data.stream()
//		.parallel()
//		.map(n->n*2)
//		.toList();//toList() preserves encounter order f
//		System.out.println(result);
		
//		List<Integer>result=data.parallelStream()
//		.filter(n->n>2)
//		.toList();////.forEach(System.out::println);
//		System.out.println(result);
		
		
		
		int result1 =data.parallelStream()
				.reduce(0,Integer::sum); //What does 0 do?It gives the starting value for the calculation.
		System.out.println(result1);
		
		
		
		
	}

}
