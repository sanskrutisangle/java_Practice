package functionalInterfaces;
import java.util.function.Function;

public class FunctionCompositionDemo {
	public static void main(String[] args) {
		
//		Function<Integer,Integer> add=x->x+10;
//		Function<Integer,Integer>mul=x->x*2;
//		Function<Integer,Integer>result1=add.andThen(mul);
//		Function<Integer,Integer>result2=add.andThen(mul);
//		
//		System.out.println(result1.apply(2));
//		System.out.println(result2.apply(3));
//		
//		
//		Function<Integer,Integer>result3 = add.compose(mul);
//		System.out.println(result3.apply(2));
//		System.out.println(result3.apply(3));
//		
		
		//Ex 2
		
		Function<String, String> task=String::trim;
		
		Function<String,String> task1=String::toUpperCase;
		
		Function<String,Integer> task2=String::length;
		
		System.out.println(task.andThen(task1).andThen(task2).apply("sanskruti     "));
		
		
		
	}

}
