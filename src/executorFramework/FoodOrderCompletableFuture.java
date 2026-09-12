package executorFramework;
import java.util.concurrent.CompletableFuture;

public class FoodOrderCompletableFuture {

    public static void main(String[] args) {

        CompletableFuture<String> order = CompletableFuture
                .supplyAsync(() -> {
                    System.out.println("Getting customer details...");
                    return "Customer: Sanskruti";
                })

                .thenApply(customer -> {
                    System.out.println("Checking restaurant...");
                    return customer + " | Restaurant: Available";
                })

                .thenCompose(orderDetails ->
                        CompletableFuture.supplyAsync(() -> {
                            System.out.println("Calculating order price...");
                            double price = 450.0;

                            return orderDetails + " | Total Price: ₹" + price;
                        })
                )

                .thenApply(orderDetails -> {
                    System.out.println("Creating order confirmation...");

                    return orderDetails
                            + " | Order Status: CONFIRMED";
                })

                .exceptionally(error -> {
                    return "Order failed: " + error.getMessage();
                });

        System.out.println(order.join());//Because join() waits for the complete CompletableFuture chain to finish.
        //"Wait until order has completed all its operations. Then give me the final result and print it."
        //join() makes the calling/current thread wait until the CompletableFuture is completed.
    }
}