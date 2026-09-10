package multithreading;
class Acc{
	private int balance=100000;
	//intrinsic lock
	public synchronized void withdraw(int amount) throws InterruptedException  {
		System.out.println(Thread.currentThread().getName()+"attempting to withdraw "+amount);
		if(balance>=amount) {
			System.out.println(Thread.currentThread()+"proceeding with withdrawal");
			Thread.sleep(5000);
			balance-=amount;
			System.out.println(Thread.currentThread()+"completed  withdrawal remaining balance "+ balance);
		}else {
			System.out.println(Thread.currentThread().getName()+ "insufficient balance ");
		}
	}

}
public class BankAccount {
	public static void main(String[] args) {
		Acc a=new Acc();
		Runnable task=new Runnable() {
			@Override 
			public void run() {
				try {
					a.withdraw(100);
				}catch(InterruptedException e) {
					e.printStackTrace();
				}
				
			}
		};
		
		Thread t1=new Thread(task,"Thread 1 ");
		Thread t2=new Thread(task,"Thread 2 ");
		
		
		t1.start();
		t2.start();
		
	}
}
