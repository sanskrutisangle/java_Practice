package streamApi;
import java.util.*;
import java.util.stream.Collectors;
public class EmployeeSalaryStatistics {
	public static void main(String[] args) {
		List<Employee> data = List.of(
	            new Employee("sanskruti","IT", 8900000),
	            new Employee("sakshi","HR", 100000),
	            new Employee("om","IT", 300000),
	            new Employee("rahul","HR", 700000)
	        );
		
		DoubleSummaryStatistics result= data.stream()
		.collect(Collectors.summarizingDouble(Employee::getSalary));//DoubleSummaryStatistics is a Java class that stores summary information about double values
		
		System.out.println(result);
	}

}
