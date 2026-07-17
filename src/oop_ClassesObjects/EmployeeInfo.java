package oop_ClassesObjects;

import java.util.Scanner;

class Employee {
    int id;
    String name;
    double salary;

    void display() {
        System.out.println("ID     : " + id);
        System.out.println("Name   : " + name);
        System.out.println("Salary : " + salary);
        System.out.println();
    }
}

public class EmployeeInfo {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Step 1: Create first Employee object
        Employee e1 = new Employee();

        // Step 2: Take input
        System.out.println("Enter First Employee Details");

        System.out.print("Enter ID: ");
        e1.id = sc.nextInt();
        sc.nextLine(); // Consume newline

        System.out.print("Enter Name: ");
        e1.name = sc.nextLine();

        System.out.print("Enter Salary: ");
        e1.salary = sc.nextDouble();

        // Step 3 & 4: Multiple references to the same object
        Employee e2 = e1;
        Employee e3 = e2;

        // Step 5: Display details
        System.out.println("\n--- Employee Details (Before Update) ---");

        System.out.println("Using e1");
        e1.display();

        System.out.println("Using e2");
        e2.display();

        System.out.println("Using e3");
        e3.display();

        // Step 6 & 7: Update using different references
        System.out.println("Updating Salary using e2...");
        e2.salary = 70000;

        System.out.println("Updating Name using e3...");
        e3.name = "Updated Employee";

        // Step 8: Display after update
        System.out.println("\n--- Employee Details (After Update) ---");

        System.out.println("Using e1");
        e1.display();

        System.out.println("Using e2");
        e2.display();

        System.out.println("Using e3");
        e3.display();

        // Step 9: Compare references
        System.out.println("e1 == e2 : " + (e1 == e2));
        System.out.println("e2 == e3 : " + (e2 == e3));
        System.out.println("e1 == e3 : " + (e1 == e3));

        // Step 10: Create second Employee object
        e2 = new Employee();

        // Step 11: Input second employee details
        System.out.println("\nEnter Second Employee Details");

        System.out.print("Enter ID: ");
        e2.id = sc.nextInt();
        sc.nextLine();

        System.out.print("Enter Name: ");
        e2.name = sc.nextLine();

        System.out.print("Enter Salary: ");
        e2.salary = sc.nextDouble();

        // Step 12: Display details
        System.out.println("\n--- Final Employee Details ---");

        System.out.println("Using e1");
        e1.display();

        System.out.println("Using e2");
        e2.display();

        System.out.println("Using e3");
        e3.display();

        // Step 13
        e1 = null;

        // Step 14
        System.out.println("\nAfter e1 = null");

        System.out.println("Using e3");
        e3.display();

        sc.close();
    }
}