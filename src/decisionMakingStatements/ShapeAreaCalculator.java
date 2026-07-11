package decisionMakingStatements;
import java.util.Scanner;


public class ShapeAreaCalculator {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("===== AREA CALCULATOR =====");
        System.out.println("1. Rectangle");
        System.out.println("2. Square");
        System.out.println("3. Circle");
        System.out.println("4. Triangle");

        System.out.print("Enter your choice: ");
        int choice = sc.nextInt();

        switch (choice) {

            case 1:
                System.out.print("Enter Length: ");
                double length = sc.nextDouble();

                System.out.print("Enter Width: ");
                double width = sc.nextDouble();

                System.out.println("Area = " + (length * width));
                break;

            case 2:
                System.out.print("Enter Side: ");
                double side = sc.nextDouble();

                System.out.println("Area = " + (side * side));
                break;

            case 3:
                System.out.print("Enter Radius: ");
                double radius = sc.nextDouble();

                double area = 3.14159 * radius * radius;
                System.out.println("Area = " + area);
                break;

            case 4:
                System.out.print("Enter Base: ");
                double base = sc.nextDouble();

                System.out.print("Enter Height: ");
                double height = sc.nextDouble();

                System.out.println("Area = " + (0.5 * base * height));
                break;

            default:
                System.out.println("Invalid Choice");
        }

        sc.close();
    }
}