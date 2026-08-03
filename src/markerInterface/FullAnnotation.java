package markerInterface;
@interface Course{
	String name();
	int duration();
}
@Course(name="java",duration=5)
class Student1 {
	void show() {
		System.out.println("Learning Java");
	}
}
public class FullAnnotation {
	public static void main(String[] args) {

        Student1 s = new Student1();
        s.show();
    }

}
