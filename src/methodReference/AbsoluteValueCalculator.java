package methodReference;
import java.util.function.*;

public class AbsoluteValueCalculator {
	public static void main(String[] args) {
		Function<Integer,Integer> num=Math::abs;
		
		System.out.println(num.apply(-2));
		System.out.println(num.apply(2));
		
		
	}

}
