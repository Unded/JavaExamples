package concurrency.blockedqueue.arrayblockingq;

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;

/**
 * BlockingQueue simple example.
 * <p>
 * To exclude spinlock (in second thread, in method .poll())
 * was added synchronized block.
 */

public class BCDemoPollMethod {

    static Integer counter = 0;
    static volatile boolean FLAG = true;

    public static void main(String[] args) {
        BlockingQueue<Integer> bq = new ArrayBlockingQueue<>(10);

        new Thread(() -> {
            synchronized (bq) {
                while (FLAG) {
                    try {
                        Thread.sleep(1000);
                        System.out.println("put : " + ++counter);
                        bq.put(counter);

                        bq.notify();
                        if (counter == 5)
                            break;
                        bq.wait();

                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            }
        }).start();

        new Thread(() -> {
            synchronized (bq) {
                while (FLAG) {
                    Integer data = bq.poll();
                    if (data != null) {
                        System.out.println("take : " + data);
                    } else {
                        try {
                            if (counter == 5)
                                break;
                            bq.notify();
                            bq.wait();
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                    }
                }
            }
        }).start();
    }
}
