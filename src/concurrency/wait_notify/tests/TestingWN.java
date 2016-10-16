package concurrency.wait_notify.tests;

public class TestingWN {
    public static void main(String[] args) {
        Object bj0 = new Object();
        Object bj1 = new Object();

        synchronized (bj0){
            synchronized (bj1){
                bj1.notify();
            }
        }

    }
}
