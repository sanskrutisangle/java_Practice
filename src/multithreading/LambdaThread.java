package multithreading;

public class LambdaThread {
	public static void main(String[] args) {
		Thread t=new Thread(()->{
			System.out.println("hello");
		});
		
		t.start();
		
		
		
	}

}
