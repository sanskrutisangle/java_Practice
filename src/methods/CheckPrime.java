package methods;

import java.util.Scanner;

public class CheckPrime {
	static boolean checkPrime(int num) {
		if(num<=1) {
			return false;
		}
		for(int i=2;i<num;i++) {
			if(num%i==0) {
				return false;
			}
		}
		return true;
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("Enter N: ");
        int n = sc.nextInt();

        System.out.println("Prime numbers from 1 to " + n + " are:");
        
        for(int i=1;i<=n;i++) {
        	if(checkPrime(i)) {
        		System.out.println(i);
        	}
        }
        sc.close();
	}

}
