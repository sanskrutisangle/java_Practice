package methods;

public class printNumber {
	public void printNum() {//it belongs to an object of the class
		for(int i=1;i<=10;i++) {
			System.out.println(i);
		}
		
	}
		public static void main(String[] args) {//main() is static, it cannot directly call a non-static method.
			printNumber obj=new printNumber();
			obj.printNum();
			
		}
	}


