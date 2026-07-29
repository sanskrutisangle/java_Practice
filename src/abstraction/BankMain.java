package abstraction;
abstract class Bank{
	abstract void calculateInterest();
	void bankRules(){
		System.out.println("Follow RBI Rules...");
	}
}
class SBI extends Bank{
	@Override
	void calculateInterest() {
		System.out.println("SBI Interest : 6%");
	}
}
class HDFC extends Bank{
	@Override
	void calculateInterest() {
		System.out.println("HDFC Interest : 7%");
	}
}
public class BankMain {
	public static void main(String[] args) {
		Bank b=new SBI();
		b.calculateInterest();
		b.bankRules();
		
		System.out.println("=======================================");
		
		Bank b1=new HDFC();
		b1. calculateInterest();
		b.bankRules();
		
	}

}
