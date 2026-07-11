package decisionMakingStatements;
import java.util.Scanner;

public class BMICalculator {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter your weight (kg): ");
        double weight = sc.nextDouble();

        System.out.print("Enter your height (meters): ");
        double height = sc.nextDouble();

        if (weight <= 0 || height <= 0) {
            System.out.println("Invalid input.");
        } 
        else {
            double bmi = weight / (height * height);

            System.out.printf("BMI = %.2f\n", bmi);

            if (bmi < 18.5) {
                System.out.println("Category: Underweight");
            }
            else if (bmi < 25) {
                System.out.println("Category: Normal Weight");
            }
            else if (bmi < 30) {
                System.out.println("Category: Overweight");
            }
            else {
                System.out.println("Category: Obese");
            }
        }

        sc.close();
    }
}
