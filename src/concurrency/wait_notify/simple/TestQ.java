package concurrency.wait_notify.simple;

public class TestQ {
    public static void main(String[] args) {

        Q q = new Q();

        new Producer(q);
        new Consumer(q);

    }
}
