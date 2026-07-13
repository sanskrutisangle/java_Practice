package methods;

import java.util.Scanner;

public class Armstrongnum {
	static boolean checkArmstrong(int num) {
		int original=num;
		int sum=0;
		for (;num!=0;num=num/10) {
			int digit=num%10;
			sum=sum+(digit*digit*digit);
		}
		return sum==original;
		
		
	}
	public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int num = sc.nextInt();
        if (checkArmstrong(num)) {
            System.out.println(num + " is an Armstrong Number");
        } else {
            System.out.println(num + " is Not an Armstrong Number");
        }
        sc.close();
        
	}

}
