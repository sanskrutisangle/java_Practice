package interfaceEx;


interface Order {

    // Abstract method
    void placeOrder();

    // Default method
    default void orderSuccess() {
        generateBill();
        System.out.println("Order placed successfully.");
    }

    // Static method
    static void shoppingPolicy() {
        System.out.println("Shopping Policy:");
        System.out.println("1. Free delivery above ₹499.");
        System.out.println("2. Return available within 7 days.");
    }

    // Private method (Java 9+)
    private void generateBill() {
        System.out.println("Bill generated successfully.");
    }
}

class MobileOrder implements Order {

    @Override
    public void placeOrder() {
        System.out.println("Mobile order has been placed.");
    }
}

public class OnlineShoppingSystem {

    public static void main(String[] args) {

        Order order = new MobileOrder();

        order.placeOrder();          // Abstract method
        order.orderSuccess();        // Default method

        Order.shoppingPolicy();      // Static method
    }
}



