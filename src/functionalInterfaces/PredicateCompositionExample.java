package functionalInterfaces;

import java.util.function.Predicate;

public class PredicateCompositionExample {
	public static void main(String[] args) {
		Predicate<Integer> iseven=num->num%2==0;
		
		Predicate<Integer> positive=num->num>0;
		
		
		 Predicate<Integer> evenAndPositive=iseven.and(positive);
		 
		 Predicate<Integer> evenOrPositive =iseven.or(positive);
		 
		 Predicate<Integer> notEven=iseven.negate();
		 
		 System.out.println("AND result: " + evenAndPositive.test(10));

	        System.out.println("OR result: " + evenOrPositive.test(-10));

	        System.out.println("NEGATE result: " + notEven.test(7));
	}

}
