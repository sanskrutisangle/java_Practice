package lambdaExpression;



@FunctionalInterface
interface takenum{
	boolean num(int n);
}
public class PositiveNum {
	public static void main(String[] args) {
		takenum n1=(n)->n>0;
		System.out.println(n1.num(-9));	
	}

}
