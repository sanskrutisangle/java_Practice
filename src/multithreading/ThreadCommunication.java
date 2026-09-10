package multithreading;

class SharedResource {

    private int data;
    private boolean hasData;

    // Producer
    public synchronized void produce(int value) {

        // Wait if data is already available
        while (hasData) {
            try {
                wait();
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
                return;
            }
        }

        // Produce data
        data = value;
        hasData = true;

        System.out.println("Produced: " + value);

        // Notify consumer
        notify();
    }

    // Consumer
    public synchronized int consume() {

        // Wait if no data is available
        while (!hasData) {
            try {
                wait();
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
                return -1;
            }
        }

        // Consume data
        hasData = false;

        System.out.println("Consumed: " + data);

        // Notify producer
        notify();

        return data;
    }
}


// Producer class
class Producer implements Runnable {

    private SharedResource resource;

    public Producer(SharedResource resource) {
        this.resource = resource;
    }

    @Override
    public void run() {

        for (int i = 0; i < 10; i++) {

            resource.produce(i);

            System.out.println("Producer produced: " + i);
        }
    }
}


// Consumer class
class Consumer implements Runnable {

    private SharedResource resource;

    public Consumer(SharedResource resource) {
        this.resource = resource;
    }

    @Override
    public void run() {

        for (int i = 0; i < 10; i++) {

            int value = resource.consume();

            System.out.println("Consumer consumed: " + value);
        }
    }
}


// Main class
public class ThreadCommunication {

    public static void main(String[] args) {

        SharedResource resource = new SharedResource();

        Thread producerThread =
                new Thread(new Producer(resource));

        Thread consumerThread =
                new Thread(new Consumer(resource));

        producerThread.start();
        consumerThread.start();
    }
}