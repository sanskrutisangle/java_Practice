package functionalInterfaces;
import java.util.function.*;

public class ConvertString {
	public static void main(String[] args) {
		Function<String,String> str=(word)->word.toUpperCase();
		System.out.println(str.apply("java"));
		System.out.println(str.apply("sanskruti"));
		
		}

}
