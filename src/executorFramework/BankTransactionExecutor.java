package executorFramework;
import java.util.concurrent.*;

public class BankTransactionExecutor {
	public static void main(String[] args) {
		ExecutorService executor=Executors.newFixedThreadPool(3);
		
		for(int i=0;i<6;i++) {
			int num=i;
			executor.submit(()->{
				System.out.println("transaction number : "+ num+" thread executing it "+Thread.currentThread().getName());
			});
		}
		executor.shutdown();
	}

}
