package lambdaExpression;
import java.util.function.*;
public class BuiltinFunctional {
	
	public static void main(String[] args) {

        Predicate<Integer> even = n -> n % 2 == 0;

        Function<String, Integer> length = str -> str.length();

        Consumer<String> print = name -> System.out.println("Hello " + name);

        Supplier<Double> random = () -> Math.random();

        System.out.println(even.test(20));

        System.out.println(length.apply("Java"));

        print.accept("Sanskruti");

        System.out.println(random.get());
	}
}
