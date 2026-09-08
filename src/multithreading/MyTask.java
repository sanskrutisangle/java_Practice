package multithreading;

class Number {
    int count = 0;
}

class result extends Thread {

    Number number;

    public result(Number number) {
        this.number = number;
    }

    public void run() {
        for (int i = 0; i < 5; i++) {
        	synchronized(number) {
        		number.count++;
        	}
            
        }
    }
}

public class MyTask {

    public static void main(String[] args) throws InterruptedException {

        Number number = new Number();

        result t1 = new result(number);
        result t2 = new result(number);

        t1.start();
        t2.start();

        t1.join();
        t2.join();

        System.out.println("Final count = " + number.count);
    }
}