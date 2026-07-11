package decisionMakingStatements;
import java.util.Scanner;

public class LargestOfFour {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter first number: ");
        int a = sc.nextInt();

        System.out.print("Enter second number: ");
        int b = sc.nextInt();

        System.out.print("Enter third number: ");
        int c = sc.nextInt();

        System.out.print("Enter fourth number: ");
        int d = sc.nextInt();

        if (a >= b && a >= c && a >= d) {
            System.out.println(a + " is the largest number.");
        }
        else if (b >= a && b >= c && b >= d) {
            System.out.println(b + " is the largest number.");
        }
        else if (c >= a && c >= b && c >= d) {
            System.out.println(c + " is the largest number.");
        }
        else {
            System.out.println(d + " is the largest number.");
        }

        sc.close();
    }
}