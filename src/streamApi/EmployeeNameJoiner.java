package streamApi;

import java.util.*;
import java.util.stream.Collectors;

public class EmployeeNameJoiner {
	public static void main(String[] args) {
		List<Employee> data = List.of(
	            new Employee("sanskruti","IT", 8900000),
	            new Employee("sakshi","HR", 100000),
	            new Employee("om","IT", 300000),
	            new Employee("rahul","HR", 700000)
	        );
		String names=data.stream()
				.map(Employee::getName)
		.collect(Collectors.joining("|"));//produces one single String as the final result.
		System.out.println(names);
	}

}
