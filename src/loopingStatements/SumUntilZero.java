package loopingStatements;

import java.util.Scanner;

public class SumUntilZero {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int number;
        int sum = 0;

        System.out.println("Enter numbers (Enter 0 to stop):");

        while (true) {

            number = sc.nextInt();

            if (number == 0) {
                break;
            }

            sum = sum + number;
        }

        System.out.println("Total Sum = " + sum);

        sc.close();
    }
}