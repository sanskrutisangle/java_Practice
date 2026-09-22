package lambdaExpression;



interface CalculatorA{
	int  calculate(int a, int b);
}
public class BlockLambdaWithReturn {
	public static void main(String[] args) {
		CalculatorA c=(a,b)->{
			int add=a+b;
			int mul=add*2;
			return mul;
		};
		
		System.out.println(c.calculate(1, 2));
	}

}
