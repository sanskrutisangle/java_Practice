package methods;

public class MethodOverloadingAddition {
	static int add(int a,int b) {
		return a+b;
	}
	static int add(int a,int b,int c) {
		return a+b+c;
		
	}
	static double add(double a,double b) {
		return a+b;
	}
	 public static void main(String[] args) {
		 System.out.println(add(2,4));
		 System.out.println(add(2,4,6));
		 System.out.println(add(10.2,20.3));
		 
	 }

}
