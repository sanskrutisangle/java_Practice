package multithreading;
class count{
	static int count =0;
	static synchronized void increment() {
		count++;
		System.out.println(
	            Thread.currentThread().getName() +
	            " : " + count
	        );
	}
}

class MyT extends Thread {
	public void run() {
		for(int i=0;i<5;i++) {
			count.increment();
		}
	}
	
}
public class Counter {
	public static void main(String[] args) {
		MyT t1=new MyT();
		MyT t2=new MyT();
		 t1.setName("Thread 1");
	        t2.setName("Thread 2");
		t1.start();
		t2.start();
		}

}
