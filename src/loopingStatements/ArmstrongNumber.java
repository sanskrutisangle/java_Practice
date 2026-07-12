package loopingStatements;

import java.util.Scanner;

public class ArmstrongNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a 3-digit number: ");
        int num = sc.nextInt();

        int original = num;
        int sum = 0;

        for (; num != 0; num = num / 10) {
            int digit = num % 10;
            sum = sum + (digit * digit * digit);
        }

        if (original == sum) {
            System.out.println("Armstrong Number");
        } else {
            System.out.println("Not an Armstrong Number");
        }

        sc.close();
    }
}