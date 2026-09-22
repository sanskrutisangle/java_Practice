package lambdaExpression;


interface Task{
	int mul(int a,int b);
}
public class Multiplication {
	public static void main(String[] args) {
		Task t=(a,b)->a*b;
		System.out.println(t.mul(2,2));
	}

}
