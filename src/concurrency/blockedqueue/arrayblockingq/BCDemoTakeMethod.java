package concurrency.blockedqueue.arrayblockingq;

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;

/**
 * BlockingQueue simple example.
 * There is no need to use synchronized block.
 * Method .take() makes thread waiting until there is no data.
 */

public class BCDemoTakeMethod {

    static Integer counter = 0;

    public static void main(String[] args) {
        BlockingQueue<Integer> bq = new ArrayBlockingQueue<>(10);

        new Thread(() -> {
            while (true) {
                try {
                    Thread.sleep(1000);
                    System.out.println("put : " + ++counter);
                    bq.put(counter);
                    if (counter == 5)
                        break;
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }).start();

        new Thread(() -> {
            while (true) {
                try {
                    Integer data = bq.take();
                    System.out.println("take : " + data);
                    if (counter == 5)
                        break;
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }

            }
        }).start();
    }
}
