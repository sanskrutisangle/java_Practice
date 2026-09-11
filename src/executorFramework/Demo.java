package executorFramework;
import java.util.concurrent.*;
public class Demo {
	public static void main(String[] args) {
		ExecutorService executor =Executors.newFixedThreadPool(2);
		
		for(int i=0;i<5;i++) {
			int task=i;
			executor.execute(()->{
				System.out.println("taskId : "+task+" is performed by "+Thread.currentThread().getName());
			});
		}
		executor.shutdown();
	}

}
