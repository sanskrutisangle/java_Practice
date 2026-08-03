package markerInterface;
import java.io.Serializable;
class StudentDemo implements Serializable{
	int id;
    String name;

    StudentDemo(int id, String name) {
        this.id = id;
        this.name = name;
    }

    void display() {
        System.out.println("ID : " + id);
        System.out.println("Name : " + name);
    }
}
public class SerializableEx {
	public static void main(String[] args) {

		StudentDemo s1 = new StudentDemo(101, "Sanskruti");

        s1.display();

        if (s1 instanceof Serializable) {
            System.out.println("Student object is Serializable.");
        }
    }
}
