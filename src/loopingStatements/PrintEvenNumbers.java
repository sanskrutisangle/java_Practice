package loopingStatements;

import java.util.Scanner;

public class PrintEvenNumbers {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the value of N: ");
        int n = sc.nextInt();

        int i = 2;

        while (i <= n) {
            System.out.println(i);
            i = i + 2;
        }

        sc.close();
    }
}