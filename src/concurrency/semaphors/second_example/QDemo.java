package concurrency.semaphors.second_example;

public class QDemo {
    public static void main(String[] args) {
        Q q = new Q();

        new Producer(q);
        new Consumer(q);
    }
}
