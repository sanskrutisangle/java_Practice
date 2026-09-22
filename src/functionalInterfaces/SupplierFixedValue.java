package functionalInterfaces;
import java.util.function.*;


public class SupplierFixedValue {
	public static void main(String[] args) {
		Supplier<Integer> task=()->10;
		System.out.println(task.get());
		
	}

}
