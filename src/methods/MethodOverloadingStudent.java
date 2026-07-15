package methods;

public class MethodOverloadingStudent {

    // Display student name
    static void display(String name) {
        System.out.println("Student Name : " + name);
    }

    // Display student name and age
    static void display(String name, int age) {
        System.out.println("Student Name : " + name);
        System.out.println("Student Age  : " + age);
    }

    // Display student name, age, and marks
    static void display(String name, int age, double marks) {
        System.out.println("Student Name  : " + name);
        System.out.println("Student Age   : " + age);
        System.out.println("Student Marks : " + marks);
    }

    public static void main(String[] args) {

        display("Sanskruti");

        System.out.println();

        display("Sanskruti", 20);

        System.out.println();

        display("Sanskruti", 20, 92.5);
    }
}