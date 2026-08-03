package markerInterface;
class Employee1 implements Cloneable {

    int id;
    String name;

    Employee1(int id, String name) {
        this.id = id;
        this.name = name;
    }
    @Override
    public Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
    void display() {
        System.out.println(id + " " + name);
    }
}
public class CloneableEx {
	public static void main(String[] args) throws CloneNotSupportedException {

        Employee1 e1 = new Employee1(101, "Sanskruti");

        Employee1 e2 = (Employee1) e1.clone();

        System.out.println("Original Object");
        e1.display();

        System.out.println("Cloned Object");
        e2.display();
    }

}
