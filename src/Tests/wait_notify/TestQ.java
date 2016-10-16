package Tests.wait_notify;

public class TestQ {
    public static void main(String[] args) {

        Q q = new Q();

        new Producer(q, 0);
        new Consumer(q);

    }
}
