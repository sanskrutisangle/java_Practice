package streamApi;
import java.util.*;

import java.util.List;
import java.util.stream.Collectors;

public class EmployeeDepartmentGrouper {

    public static void main(String[] args) {

        List<Employee> employees = Arrays.asList(
            new Employee("Rahul", "IT", 60000),
            new Employee("Amit", "HR", 45000),
            new Employee("Neha", "IT", 70000),
            new Employee("Priya", "Finance", 50000),
            new Employee("Om", "HR", 55000)
        );

        Map<String, List<Employee>> result = employees.stream()
                .collect(Collectors.groupingBy(Employee::getDepartment));

        System.out.println(result);
    }
}