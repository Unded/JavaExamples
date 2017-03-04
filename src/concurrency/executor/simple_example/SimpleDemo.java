package concurrency.executor.simple_example;

import java.util.concurrent.*;

public class SimpleDemo {
    public static void main(String[] args) {
        CountDownLatch latch1 = new CountDownLatch(3);
        CountDownLatch latch2 = new CountDownLatch(3);
        CountDownLatch latch3 = new CountDownLatch(3);
        CountDownLatch latch4 = new CountDownLatch(3);

        int availableProcessors = Runtime.getRuntime().availableProcessors();
        int availableThreads = availableProcessors * 4;
        ExecutorService executorService = Executors.newFixedThreadPool(availableThreads);

        // Print some info
        System.out.println("Available processors: " + availableProcessors);
        System.out.println("Available threads: " + availableThreads);
        System.out.println("Running threads");

        executorService.execute(new ExecutorThread(latch1, "A"));
        executorService.execute(new ExecutorThread(latch2, "B"));
        executorService.execute(new ExecutorThread(latch3, "C"));
        executorService.execute(new ExecutorThread(latch4, "D"));
        try {
            //Если создать только одну переменную CountDownLatch
            //то главный поток закончится раньше созданных
            latch1.await();
            latch2.await();
            latch3.await();
            latch4.await();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        executorService.shutdown();
        System.out.println("Finishing threads");
    }
}
