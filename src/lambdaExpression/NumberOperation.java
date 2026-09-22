package lambdaExpression;


interface Work{
	void perform(int a);
}
public class NumberOperation {
	public static void main(String[] args) {
		Work w=(a)->{
			int square=a*a;
			int cube=a*a*a;
			
			System.out.println(a);
			System.out.println(square);
			System.out.println(cube);
		};
		
		w.perform(99);
	}

}
