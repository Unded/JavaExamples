package concurrency.executor.simple_example;

import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class SimpleDemo {
    public static void main(String[] args) {
        CountDownLatch latch1 = new CountDownLatch(3);
        CountDownLatch latch2 = new CountDownLatch(3);
        CountDownLatch latch3 = new CountDownLatch(3);
        CountDownLatch latch4 = new CountDownLatch(3);
        ExecutorService executorService = Executors.newFixedThreadPool(2);
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
