package functionalInterfaces;
import java.util.function.*;

public class DemoBiPredicate {
	public static void main(String[] args) {
		BiPredicate<Integer,Integer> euq=(a,b)->a.equals(b);
		System.out.println(euq.test(2, 2));
	}

}
