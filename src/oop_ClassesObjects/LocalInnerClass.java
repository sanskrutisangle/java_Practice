package oop_ClassesObjects;
class School{
	void show() {

        class Teacher {

            void teach() {
                System.out.println("Teaching Java");
            }
        }

        Teacher t = new Teacher();

        t.teach();
    }
}
public class LocalInnerClass {
	public static void main(String[] args) {
		School s = new School();

        s.show();
	}

}
