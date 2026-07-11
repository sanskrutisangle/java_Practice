package decisionMakingStatements;
import java.util.Scanner;

public class LeapYear {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("enter year");
		int year =sc.nextInt();
		if(year%400==0||(year%4==0&&year%100!=0)) {
			System.out.print("leap year");
		}else {
			System.out.print("Not a Leap Year");
		}
		sc.close();
		}
	
	/*if(year%400==0){
 	System.out.print("leap year");
  }elseIf(year%4==0)  {
  	System.out.print("leap year");
  }elseIf(year%100!=0){
  System.out.print("Not a Leap Year");
  }else{
  	System.out.print("Not a Leap Year");
  }  */

}

