package oop_constructor;

public class Employee {

    int id;
    String name;
    double salary;

    // Constructor 1
    Employee() {
        System.out.println("Default Constructor");
    }

    // Constructor 2
    Employee(int id, String name) {
        this.id = id;
        this.name = name;
    }

    // Constructor 3
    Employee(int id, String name, double salary) {
        this.id = id;
        this.name = name;
        this.salary = salary;
    }

    void display() {
        System.out.println("ID     : " + id);
        System.out.println("Name   : " + name);
        System.out.println("Salary : " + salary);
    }

    public static void main(String[] args) {

        Employee e1 = new Employee();

        Employee e2 = new Employee(101, "Rahul");

        Employee e3 = new Employee(102, "Priya", 50000);

        e2.display();
        System.out.println();

        e3.display();
    }
}
