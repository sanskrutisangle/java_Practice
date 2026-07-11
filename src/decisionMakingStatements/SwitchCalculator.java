package decisionMakingStatements;

import java.util.Scanner;

public class SwitchCalculator {
	public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("enter first number :");
        int num1 =sc.nextInt();
        System.out.print("enter second number :");
        int num2 =sc.nextInt();
        
        System.out.print("Enter operator (+, -, *, /, %):");
        char operator=sc.next().charAt(0);
        
        switch(operator) {
        case '+' : 
        	System.out.println("result : " + (num1 +num2));
        	break;
        case '-':
        	System.out.println("result : "+(num1-num2));
        	break;
        case '*':
        	System.out.println("result : "+(num1*num2));
        	break;
        case '%':
        	if(num2!=0) {
        		System.out.println("result : "+(num1%num2));
        	}else {
        		System.out.println("Division by zero is not allowed.");
        	}        	
        	break;
        case '/':
        	if(num2!=0) {
        		System.out.println("result : "+(num1/num2));
        	}else {
        		System.out.println("Modulus by zero is not allowed.");
        	}        	
        	break;
        default : 
        	System.out.println("invalid opration  ");
        }
        sc.close();
        }

}
