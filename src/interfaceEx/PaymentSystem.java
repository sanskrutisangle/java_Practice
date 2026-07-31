package interfaceEx;


interface Payment {

    // Abstract method
    void pay(double amount);

    // Default method
    default void paymentSuccess() {
        saveTransaction();
        System.out.println("Payment completed successfully.");
    }

    // Static method
    static void paymentRules() {
        System.out.println("Rules:");
        System.out.println("1. Payment amount must be greater than 0.");
        System.out.println("2. Refund is available within 7 days.");
    }

    // Private method (Java 9+)
    private void saveTransaction() {
        System.out.println("Transaction saved to database.");
    }
}

class UPIEx implements Payment {

    @Override
    public void pay(double amount) {
        System.out.println("Paid ₹" + amount + " using UPI.");
    }
}

public class PaymentSystem {

    public static void main(String[] args) {

        Payment p = new UPIEx();

        p.pay(1500);              // Abstract method
        p.paymentSuccess();       // Default method

        Payment.paymentRules();   // Static method
    }
}
 
