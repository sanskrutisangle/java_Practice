package executorFramework;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class FoodOrderProcessor {
	public static void main(String[] args) {
		ExecutorService executor=Executors.newFixedThreadPool(2);
		
		for(int i=0;i<10;i++) {
			int id=i;
			executor.submit(()->{
				System.out.println("id : "+id +
						" thread processing it : "+Thread.currentThread().getName());
				try {
					Thread.sleep(3000);
				}catch(Exception e) {
					System.out.println("Exception occure");
				}
			});
		}
		executor.shutdown();
	}
}
