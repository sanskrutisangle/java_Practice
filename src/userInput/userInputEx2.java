package userInput;

import java.util.Scanner;

public class userInputEx2 {
	/* Write a Java program that asks the user to enter the following details:

Full Name
Age
Gender (M/F)
Mobile Number
CGPA
City

After taking all the input, display it in a neat format.

Expected Output :
========= Student Details =========

Full Name : Sanskruti Sangale
Age       : 20
Gender    : F
Mobile No : 7741061799
CGPA      : 8.75
City      : Nashik
  : Java*/
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter you full name :");
		String fName=sc.nextLine();
		
		System.out.println("Enter you age :");
		int age=sc.nextInt();
		
		System.out.println("Enter you gender(F/M :");
		char gender=sc.next().charAt(0);
		
		System.out.println("Enter you mobile number :");
		long mobNo=sc.nextLong();
		
		System.out.println("Enter your CGPA : ");
		float cgpa=sc.nextFloat();
		
		System.out.println("Enter your city : ");
		String city=sc.next();
		
		System.out.println("Enter you Favorite Programming Language");
		String language = sc.next();
		
		System.out.println("================Student Details================");
		System.out.println("Full Name : "+fName);
		System.out.println("Age       : "+age);
		System.out.println("gendere   : "+gender);
		System.out.println("mobile no : "+mobNo);
		System.out.println("CGPA      : "+cgpa);
		System.out.println("city      : "+city);
		System.out.println("language  : "+language );
		sc.close();
		
	}

}
