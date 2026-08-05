package lambdaExpression;
@FunctionalInterface
interface Student{
	void showDetails();
	default void welcome(){
		 System.out.println("Welcome Student!");
	}
	static void collegeInfo() {
		System.out.println("SIEM College");
		}
	}
	

public class lambdaExpressions {
	public static void main(String[] args) {
		Student obj= ()->System.out.println("Name: Sanskruti");
		obj.showDetails();
		obj.welcome();
		Student.collegeInfo();
		
		
	}
}
