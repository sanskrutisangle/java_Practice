package streamApi;

import java.util.*;

public class EmployeeDemo {

    public static void main(String[] args) {

        List<Employee> data = List.of(
            new Employee("sanskruti", 8900000),
            new Employee("sakshi", 100000),
            new Employee("om", 300000),
            new Employee("rahul", 700000)
        );

        data.stream()
        	.filter(n->n.getSalary()>50000)
            .map(Employee::getName)
            .forEach(System.out::println);

        Optional<Employee> result = data.stream()
            .max(Comparator.comparing(Employee::getSalary));

        result.ifPresent(e ->
            System.out.println(e.getName())
        );
        
        double totaleSalary=data.stream()
        		.map(Employee::getSalary)
        		.reduce(0.0,Double::sum);
        		//.reduce(0.0,(a,b)->a+b);
        
        System.out.println(totaleSalary);
        		
    }
}