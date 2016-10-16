package concurrency.cyclicbarrier;

public class AfterBarrier implements Runnable {
    @Override
    public void run() {
        System.out.println("Barrier destroyed");
    }
}
