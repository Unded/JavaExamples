package concurrency.cyclicbarrier;

import java.util.concurrent.BrokenBarrierException;
import java.util.concurrent.CyclicBarrier;

public class NewBarrThread implements Runnable {

    CyclicBarrier barrier;
    String name;

    NewBarrThread(CyclicBarrier barrier, String name){
        this.barrier = barrier;
        this.name = name;

        new Thread(this).start();
    }

    @Override
    public void run() {
        try{
            System.out.println("Thread " + name + " reach barrier");
            barrier.await();
            System.out.println("Thread " + name + " free");
        } catch (InterruptedException e) {
            e.printStackTrace();
        } catch (BrokenBarrierException e) {
            e.printStackTrace();
        }
    }
}
