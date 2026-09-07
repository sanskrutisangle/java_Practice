package multithreading;

public class MainThread {
	public static void main(String[] args) //throws InterruptedException 
	{
		//System.out.println("main thread is runnig");
		
		//sleep
		
		//Thread.sleep(1000);
		
		
		
		//by extending thread class
		
		MyThread obj=new MyThread();
		obj.start();
		
		obj.setPriority(8);
		System.out.println(obj.getPriority());
		
//		
		//join
		
//		obj.join();
		
//		You normally override run() to define what the thread should do.
//
//		You call start() to actually start a new thread.
		
		
		//by implementing Runnable interface
//		MyTask task=new MyTask();
//		
//		Thread t=new Thread(task);
//		t.start();

	//get and set the name of thread
		
//		Thread t=Thread.currentThread();
//		System.out.println("the name of thread : "+t.getName());
//		t.setName("mainthread");
//		System.out.println("new name of thread : "+t.getName());
		
		
				
	}

}
