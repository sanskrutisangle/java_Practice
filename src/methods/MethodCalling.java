package methods;

public class MethodCalling {

    static void greet() {
        System.out.println("Good Morning!");
    }

    static void welcome() {
        greet();    // Calling greet() method
        System.out.println("Welcome to Java");
    }

    public static void main(String[] args) {

        welcome();

    }
}