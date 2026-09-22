package functionalInterfaces;
import java.util.function.*;
import java.util.Random;


public class SupplierRandomNumber {
	public static void main(String[] args) {
		Random random = new Random();
		Supplier<Integer> task= ()->random.nextInt(100) + 1;
		System.out.println(task.get());
	}

}
