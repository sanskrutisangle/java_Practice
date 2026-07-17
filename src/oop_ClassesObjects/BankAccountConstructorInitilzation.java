package oop_ClassesObjects;
import java.util.Scanner;


class BankAccount{
	int accNo;
	String bankName;
	String userName;
	String accType;
	
	BankAccount(int accNo,String bankName ,String userName,String accType){
		this.accNo=accNo;
		this.bankName=bankName;
		this.userName=userName;
		this.accType=accType;
		
		
	}
	
	void display() {
		System.out.println("Account No : "+accNo);
		System.out.println("Bank Name : "+bankName);
		System.out.println("user name : "+userName);
		System.out.println("account type :"+accType);
	}
}
public class BankAccountConstructorInitilzation {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Account No : ");
		int accNo=sc.nextInt();
		sc.nextLine();
		
		System.out.println("Enter bank name : ");
		String bankName=sc.nextLine();
		System.out.println("Enter user name : ");
		String userName=sc.nextLine();
		System.out.println("Enter account type  : ");
		String accType=sc.nextLine();
		BankAccount b1=new BankAccount(accNo,bankName,userName,accType);
		b1.display();
		
		sc.close();
	}

}
