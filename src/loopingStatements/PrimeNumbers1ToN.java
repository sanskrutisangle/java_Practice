package loopingStatements;

import java.util.Scanner;

public class PrimeNumbers1ToN {
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the value of N: ");
        int n = sc.nextInt();

        for (int num = 2; num <= n; num++) {
            int count = 0;

            for (int i = 1; i <= num; i++) {
                if (num % i == 0) {
                    count++;
                }
            }

            if (count == 2) {
                System.out.println(num);
            }
        }

        sc.close();
    }
}
