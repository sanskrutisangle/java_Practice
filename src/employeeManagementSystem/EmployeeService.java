package employeeManagementSystem;

import java.util.Scanner;

public class EmployeeService {

    Scanner sc = new Scanner(System.in);

    // Array to store Employee objects
    Employee[] employees = new Employee[10];

    // Number of employees currently stored
    int count = 0;

    // ==========================
    // Add Employee
    // ==========================
    public void addEmployee() {

        if (count == employees.length) {
            System.out.println("Employee list is full.");
            return;
        }

        System.out.println("\n===== Add Employee =====");

        System.out.print("Enter Employee Type (1. Manager  2. Developer): ");
        int type = sc.nextInt();

        System.out.print("Enter ID: ");
        int id = sc.nextInt();
        sc.nextLine();

        System.out.print("Enter Name: ");
        String name = sc.nextLine();

        System.out.print("Enter Age: ");
        int age = sc.nextInt();
        sc.nextLine();

        System.out.print("Enter Department: ");
        String department = sc.nextLine();

        System.out.print("Enter Salary: ");
        double salary = sc.nextDouble();
        sc.nextLine();

        if (type == 1) {

            System.out.print("Enter Team Size: ");
            int teamSize = sc.nextInt();

            employees[count] = new Manager(id, name, age, department, salary, teamSize);

        } else if (type == 2) {

            System.out.print("Enter Programming Language: ");
            String language = sc.nextLine();

            employees[count] = new Developer(id, name, age, department, salary, language);

        } else {

            System.out.println("Invalid Employee Type.");
            return;
        }

        count++;
        System.out.println("Employee Added Successfully.");
    }

    // ==========================
    // Display Employees
    // ==========================
    public void displayEmployees() {

        if (count == 0) {
            System.out.println("No Employees Found.");
            return;
        }

        System.out.println("\n===== Employee List =====");

        for (int i = 0; i < count; i++) {

            employees[i].display();
            System.out.println("----------------------------");
        }
    }

    // ==========================
    // Search Employee
    // ==========================
    public Employee searchEmployee(int id) {

        for (int i = 0; i < count; i++) {

            if (employees[i].id == id) {
                return employees[i];
            }
        }

        return null;
    }

    // ==========================
    // Update Salary
    // ==========================
    public void updateSalary() {

        System.out.print("Enter Employee ID: ");
        int id = sc.nextInt();

        Employee emp = searchEmployee(id);

        if (emp == null) {
            System.out.println("Employee Not Found.");
            return;
        }

        System.out.print("Enter New Salary: ");
        double newSalary = sc.nextDouble();

        emp.salary = newSalary;

        System.out.println("Salary Updated Successfully.");
    }

    // ==========================
    // Annual Salary
    // ==========================
    public void annualSalary() {

        System.out.print("Enter Employee ID: ");
        int id = sc.nextInt();

        Employee emp = searchEmployee(id);

        if (emp == null) {
            System.out.println("Employee Not Found.");
            return;
        }

        System.out.println("Annual Salary = " + emp.calculateAnnualSalary());
    }

    // ==========================
    // Check Bonus
    // ==========================
    public void checkBonus() {

        System.out.print("Enter Employee ID: ");
        int id = sc.nextInt();

        Employee emp = searchEmployee(id);

        if (emp == null) {
            System.out.println("Employee Not Found.");
            return;
        }

        emp.checkBonus();
    }
}