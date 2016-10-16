package concurrency.synch.synch_class_mth;

public class Data {
    private int value;

    public synchronized int getValue() {
        return value;
    }

    public synchronized void setValue(int value) throws InterruptedException {
        this.value = value;
        System.out.println("First :: setValue method sleep");
        Thread.sleep(1000);
        System.out.println("First :: setValue method run");
    }
}
