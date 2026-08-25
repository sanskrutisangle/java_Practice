package exceptionHandling;

public class PasswordValidationExample {

    // Method using THROW
    static void checkPassword(String password) {
        if (password.length() < 8) {
            throw new IllegalArgumentException("Password is too short");
        }

        System.out.println("Password is valid.");
    }

    // Method using THROWS
    static void login(String password) throws Exception {
        if (!password.equals("admin123")) {
            throw new Exception("Incorrect password");
        }

        System.out.println("Login successful.");
    }

    public static void main(String[] args) {

        try {
            checkPassword("abc");
            login("wrong123");
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}