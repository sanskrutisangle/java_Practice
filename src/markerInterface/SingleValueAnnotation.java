package markerInterface;
@interface Author{
	String value();
}
@Author("sanskruti")
class JavaProject {
	void display() {
		System.out.println("java project ");
	}
}
public class SingleValueAnnotation {
	public static void main(String[] args) {
		JavaProject p = new JavaProject();
        p.display();
	}

}
