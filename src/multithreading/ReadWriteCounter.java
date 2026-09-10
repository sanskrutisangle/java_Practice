package multithreading;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReadWriteLock;
import java.util.concurrent.locks.ReentrantReadWriteLock;

public class ReadWriteCounter {

    int count = 0;

    public final ReadWriteLock lock = new ReentrantReadWriteLock();

    public final Lock readLock = lock.readLock();
    public final Lock writeLock = lock.writeLock();

    // Write operation
    public void increment() {

        writeLock.lock();

        try {
            count++;
            Thread.sleep(200);
            
        }catch(Exception e ){
        	
        	Thread.interrupted();
        }
        	finally {
        }
            writeLock.unlock();
        }
    

    // Read operation
    public int getCount() {

        readLock.lock();

        try {
            return count;
        } finally {
            readLock.unlock();
        }
    }

    public static void main(String[] args) throws InterruptedException {

        ReadWriteCounter example = new ReadWriteCounter();

        // Reader task
        Runnable readTask = new Runnable() {

            @Override
            public void run() {

                for (int i = 0; i < 10; i++) {

                    System.out.println(
                        Thread.currentThread().getName()
                        + " Read: "
                        + example.getCount()
                    );
                }
            }
        };

        // Writer task
        Runnable writeTask = new Runnable() {

            @Override
            public void run() {

                for (int i = 0; i < 10; i++) {

                    example.increment();

                    System.out.println(
                        Thread.currentThread().getName()
                        + " Increment"
                    );
                }
            }
        };

        Thread writeThread = new Thread(writeTask, "Writer");

        Thread readThread = new Thread(readTask, "Reader-1");

        Thread readThread1 = new Thread(readTask, "Reader-2");

        writeThread.start();
        readThread.start();
        readThread1.start();

        writeThread.join();
        readThread.join();
        readThread1.join();

        System.out.println("Final count: " + example.getCount());
    }
}