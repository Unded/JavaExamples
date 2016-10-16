package concurrency.wait_notify.bakery;

public class Granny implements Runnable {

    private final int name;
    private final Object lock;

    Granny(int name, Object lock) {
        this.lock = lock;
        this.name = name;
    }

    @Override
    public void run() {
        synchronized (lock) {
            System.out.println("Granny " + name + " waiting ... ");
            try {
                lock.wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("Granny " + name + " buy muffin");
        }
    }
}
