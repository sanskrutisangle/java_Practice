package methods;

public class MethodResolution {
	static void display(Integer a) {
		System.out.print(a);
	}
	static void main(long a) {
		System.out.print(a);
	}
	/* static void display(float a) {
        System.out.println("float");
    }

    static void display(double a) {
        System.out.println("double");
    }
*/
	public static void main(String[] args) {

        display(10);
    }

}
