package lambdaExpression;
@FunctionalInterface
interface Square {
    int square(int num);
}
 
public class WithReturnStatement {
	public static void main(String[] args) {
		Square s=(num)->{ 
			return num*num;
		};
		System.out.println(s.square(5));
	}

}
