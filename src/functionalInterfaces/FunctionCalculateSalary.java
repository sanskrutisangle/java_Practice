package functionalInterfaces;
import java.util.function.*;

public class FunctionCalculateSalary {
	public static void main(String[] args) {
		Function<Double, Double> task=salary->salary + (salary * 0.10);
		System.out.println(task.apply(6789954.65));
	}

}
