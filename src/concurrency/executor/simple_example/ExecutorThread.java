package concurrency.executor.simple_example;

import java.util.concurrent.CountDownLatch;

public class ExecutorThread implements Runnable {

    String name;
    CountDownLatch latch;

    ExecutorThread(CountDownLatch latch, String name){
        this.latch = latch;
        this.name = name;
        new Thread(this);
    }

    @Override
    public void run() {
        for (int i = 0; i < 3; i++){
            System.out.println(name + " : " + i);
            latch.countDown();
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
