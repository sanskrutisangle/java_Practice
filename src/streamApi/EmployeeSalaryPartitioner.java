package streamApi;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class EmployeeSalaryPartitioner {
	public static void main(String[] args) {
		 List<Employee> employees = Arrays.asList(
		            new Employee("Rahul", "IT", 60000),
		            new Employee("Amit", "HR", 45000),
		            new Employee("Neha", "IT", 70000),
		            new Employee("Priya", "Finance", 50000),
		            new Employee("Om", "HR", 55000)
		        );
		 Map<Boolean,List<Employee>> result=employees.stream()
				 .collect(Collectors.partitioningBy(e->e.getSalary()>50000));
		 System.out.println(result);
	}

}
