package optionalClass;
import java.util.*;

public class EmployeeSalaryCheck {
	public static void main(String[] args) {
		
		Optional<Integer> salary = Optional.of(60000);
		
		String result=salary.filter(s->s>10000)
				.map(String::valueOf)
				.orElse("low salary");
		System.out.println(result);
		
	}

}
