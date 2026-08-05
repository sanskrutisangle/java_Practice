package lambdaExpression;
@FunctionalInterface 
interface message {
	void display(String name);
}
public class WithOneParameter {
	 public static void main(String[] args) {
		 message m=(name)->System.out.println("hello : "+name);
		 m.display("Sanskruti");
	 }

		 

}
