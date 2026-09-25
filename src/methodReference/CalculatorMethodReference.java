package methodReference;

@FunctionalInterface
interface Calculation{
	int calculate(int a,int b);
	
}
public class CalculatorMethodReference {
	static int multiply(int a,int b) {
		return a*b;
	}
	public static void main(String[] args) {
		Calculation task=CalculatorMethodReference::multiply;
		
		System.out.println(task.calculate(2,2));
		
		
	}

}
