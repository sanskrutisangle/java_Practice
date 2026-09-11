package executorFramework;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class EmployeeSalaryCalculator {

    public static void main(String[] args) {

        ExecutorService executor = Executors.newFixedThreadPool(3);

        double[] basicSalaries = {30000, 40000, 50000, 35000, 45000};

        for (int i = 0; i < basicSalaries.length; i++) {

            int employeeId = i + 1;
            double basicSalary = basicSalaries[i];

            Callable<Double> task = () -> {

                double finalSalary = basicSalary + (basicSalary * 0.20);

                return finalSalary;
            };

            Future<Double> future = executor.submit(task);

            try {
                System.out.println(
                    "Employee " + employeeId +
                    " Final Salary: " + future.get()
                );
            } catch (Exception e) {
                System.out.println("Exception occurred");
            }
        }

        executor.shutdown();
    }
}