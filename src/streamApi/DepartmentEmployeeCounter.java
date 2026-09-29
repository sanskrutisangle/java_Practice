package streamApi;

import java.util.*;
import java.util.stream.Collectors;

public class DepartmentEmployeeCounter {
	public static void main(String[] args) {
		List<Employee> data = List.of(
	            new Employee("sanskruti","IT", 8900000),
	            new Employee("sakshi","HR", 100000),
	            new Employee("om","IT", 300000),
	            new Employee("rahul","HR", 700000)
	        );
		
		
		Map<String,Long>result=data.stream()
		.collect(Collectors.groupingBy(Employee::getDepartment,Collectors.counting()));
		
		System.out.println(result);
	}

}
