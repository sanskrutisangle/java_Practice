package multithreading;
class Printer {

	 void printDocument(String name) {
		 synchronized(this) {//synchronized block 
        System.out.println(name + " started printing");

        for (int i = 1; i <= 5; i++) {
            System.out.println(name + " printing page " + i);
        }

        System.out.println(name + " finished printing");
		 }
    }
}

class Task extends Thread{
	Printer printer;
	String name;
	
	Task(Printer printer,String name){
		this.printer=printer;
		this. name=name;
			}
	public void run() {
	printer.printDocument(name);
	}
}
public class Demo {
	public static void main(String[] args) {
		Printer printer=new Printer();
		
		Task t1=new Task(printer,"sanskruti");
		Task t2=new Task(printer,"Akshay");
		
		t1.start();
		t2.start();
	}

}
