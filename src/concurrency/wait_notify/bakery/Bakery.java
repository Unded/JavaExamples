package concurrency.wait_notify.bakery;

import java.util.Random;

public class Bakery {
    private static Object lock = new Object();

    public static void main(String[] args) throws InterruptedException {

        for (int i = 1; i < 10; i++) {
            new Thread(new Granny(i, lock)).start();
            Thread.sleep(100);
        }

        bakeryWork();
    }

    private static void bakeryWork() {
        System.out.print("Bakery work hard ... ");
        Random r = new Random();
//        int muffinCount = r.nextInt(10);
        int muffinCount = 9;
        System.out.println("and make " + muffinCount + " muffins");

        for (int i = 0; i <= muffinCount; i++) {
            synchronized (lock) {
                lock.notify();
            }
        }
    }
}
