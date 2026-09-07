package multithreading;

class PrintNo extends Thread{
	
	
	
	public void run(){
		for(int i=0;i<5;i++) {
			System.out.println(i);
		}
	}
}

class PrintMsg implements Runnable{
	String msg;
	public PrintMsg(String msg) {
		this.msg=msg;
	}
	@Override 
	public void run() {
		System.out.println(msg);
	}
}
public class Main{
	public static void main(String[] args) throws InterruptedException{
		PrintNo t=new PrintNo();
		
		Thread t1=new Thread(new PrintMsg("Thread -1"));
		Thread t2=new Thread(new PrintMsg("Thread -2"));
		
		t.start();
		
		t.join();
		
		System.out.println("Main thread finished"); 
		t1.start();
		
		t2.start();
	}
}
