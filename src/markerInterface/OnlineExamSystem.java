package markerInterface;
interface Eligible {
}
class Student {
}
class RegisteredStudent extends Student implements Eligible {
}
 class OnlineExamSystem {
	public static void main(String[] args) {
		Student s1 = new Student();
        RegisteredStudent s2 = new RegisteredStudent();
        System.out.println(s1 instanceof Eligible);
        System.out.println(s2 instanceof Eligible);
	}

}
