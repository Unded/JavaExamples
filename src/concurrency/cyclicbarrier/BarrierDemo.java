package concurrency.cyclicbarrier;

import java.util.concurrent.CyclicBarrier;

public class BarrierDemo {
    public static void main(String[] args) {
        CyclicBarrier cb = new CyclicBarrier(3, new AfterBarrier());

        try {
            new NewBarrThread(cb, "A");
            Thread.sleep(100);
            new NewBarrThread(cb, "B");
            Thread.sleep(100);
            new NewBarrThread(cb, "C");
            Thread.sleep(100);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
