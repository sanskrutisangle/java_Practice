package multithreading;

public class MyTask implements Runnable{
	
	@Override
	public void run() {
		System.out.println("Thread is running");
	}
}
