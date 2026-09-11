package executorFramework;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class BankBalanceChecker {
	public static void main(String[] args) {
		
		ExecutorService executor = Executors.newFixedThreadPool(3);
		
		List<Callable<Double>> tasks=new ArrayList<>();
		
		tasks.add(()->{
			double balance=90000.90;
			return balance;
		});
		
		tasks.add(()->{
			double balance=78000.67;
			return balance;
		});
		
		
		try {
			List<Future<Double>> result=executor.invokeAll(tasks);
			for(int i=0;i<result.size();i++) {
				double balance=result.get(i).get();
				System.out.println("Account " + (i + 1) + " Balance: ₹" + balance);
			}
			
			
		}catch (Exception e) {
            e.printStackTrace();
        }

        executor.shutdown();
    }
}