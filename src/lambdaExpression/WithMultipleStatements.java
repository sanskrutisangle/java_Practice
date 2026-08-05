package lambdaExpression;
@FunctionalInterface
interface Demo {
    void show(String name);
}
public class WithMultipleStatements {
	public static void main(String[] args) {
		Demo d=(name)->{
			System.out.println("Welcome!!!");
			System.out.println("my name is "+name);
			System.out.println("Have a nice day! ");
		};
		d.show("sanskruti");
		}
	}


