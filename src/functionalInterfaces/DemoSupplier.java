package functionalInterfaces;
import java.util.function.*;

public class DemoSupplier {
	public static void main(String[] args) {
		Supplier<String> msg=()->"hello sanskruti";
		
		System.out.println(msg.get());
	}

}
