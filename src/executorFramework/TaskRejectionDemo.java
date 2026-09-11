package executorFramework;

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

public class TaskRejectionDemo {

    public static void main(String[] args) {

        ThreadPoolExecutor executor = new ThreadPoolExecutor(
                2,                      // Core threads
                2,                      // Maximum threads
                0L,
                TimeUnit.MILLISECONDS,
                new ArrayBlockingQueue<>(2),   // Queue capacity
                new ThreadPoolExecutor.AbortPolicy()
        );

        for (int i = 1; i <= 5; i++) {

            final int taskNumber = i;

            try {
                executor.execute(() -> {

                    System.out.println(
                            "Task " + taskNumber +
                            " is running by " +
                            Thread.currentThread().getName()
                    );

                    try {
                        Thread.sleep(3000);
                    } catch (InterruptedException e) {
                        Thread.currentThread().interrupt();
                    }

                });

                System.out.println("Task " + taskNumber + " submitted");

            } catch (java.util.concurrent.RejectedExecutionException e) {

                System.out.println(
                        "Task " + taskNumber + " rejected!"
                );
            }
        }

        executor.shutdown();
    }
}