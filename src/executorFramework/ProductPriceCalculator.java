package executorFramework;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class ProductPriceCalculator {
	public static void main(String[] args) {
		ExecutorService executor = Executors.newFixedThreadPool(3);
		double[] price= {
				299,
				150,
				500,
				450,
				699,
				1000,
				250,
				99
		};
		
		for(int i=0;i<price.length;i++) {
			int productId=i+1;
			double itemPrice=price[i];
			
			Callable<Double> task=()->{
				double total=itemPrice+0.50;
				return total;
			};
			
			
			Future<Double> future=executor.submit(task);
			
			try {
				System.out.println(
	                    "Product " + productId +
	                    " Final Price: " + future.get()
	                );
	            } catch (Exception e) {
	                System.out.println("Exception occurred");
	            }
		}
		 executor.shutdown();
	}
}
