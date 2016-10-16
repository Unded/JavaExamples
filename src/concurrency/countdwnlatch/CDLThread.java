package concurrency.countdwnlatch;

import java.util.concurrent.CountDownLatch;

public class CDLThread implements Runnable{

    CountDownLatch latch;

    public CDLThread(CountDownLatch latch){
        this.latch = latch;
        new Thread(this).start();
    }

    @Override
    public void run() {
        for (int i = 1; i <= 5; i++){
            System.out.println("Latch " + i + " done.");
            latch.countDown();
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
//        System.out.println("Subthread finish");
    }
}
