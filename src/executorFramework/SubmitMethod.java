package executorFramework;
import java.util.concurrent.*;


public class SubmitMethod {
	public static void main(String[] args) {
		ExecutorService execute=Executors.newFixedThreadPool(3);
		
		Future<Integer>f1=execute.submit(()->{
			try {
				Thread.sleep(3000);
			}catch(Exception e ) {
				
			}
			return 10+20;
		});
		try {
			System.out.println(f1.get());
		
		}catch(Exception e) {
			
		}
		
		execute.shutdown();
		
	}
}
