package executorFramework;
import java.util.concurrent.CompletableFuture;


public class ProductDashboardCompletableFuture {
	public static void main(String[] args) {
		CompletableFuture<String>ProductDetails =CompletableFuture.supplyAsync(()->{
			System.out.println("getting product details");
			return "product name : laptop ";
		});
		
		CompletableFuture<Double>CustomerReviews=CompletableFuture.supplyAsync(()->{
			System.out.println("product review ");
			return 4.5;
		});
		
		CompletableFuture<Double>ProductPrice =CompletableFuture.supplyAsync(()->{
			System.out.println("product price ");
			return 299.78;
		});
		
		CompletableFuture<String>dashboard=
				ProductDetails.thenCombine(CustomerReviews,
						(product, rating)->product + "rating "+ rating)
				.thenCombine(ProductPrice, (details,price)->details +" price "+price
				);
		
		
		dashboard.exceptionally((error)->{
			return "Failed to create dashboard:"+error.getMessage();
		}).thenAccept(System.out::println);
		
	}

}
