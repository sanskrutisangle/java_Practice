package loopingStatements;

import java.util.Scanner;

public class CountDigits {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int number = sc.nextInt();

        if (number == 0) {
            System.out.println("Number of digits = 1");
        } else {
            int count = 0;

            while (number > 0) {
                count++;
                number = number / 10;
            }

            System.out.println("Number of digits = " + count);
        }

        sc.close();
    }
}