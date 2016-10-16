package concurrency.countdwnlatch;

import java.util.concurrent.CountDownLatch;

public class CDLDemo {
    public static void main(String[] args) {

        CountDownLatch latch = new CountDownLatch(5);

        Thread thread = new Thread(new CDLThread(latch));

        try {
            latch.await();
            System.out.println("Subthread free!");
            thread.join();


        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("Main thread over");
    }
}
