package concurrency.semaphors.first_example;

import java.util.concurrent.Semaphore;

public class SemDemo {
    public static void main(String[] args) {
        Semaphore s = new Semaphore(1);

        new IncThread(s, "First");
        new DecThread(s, "Second");
    }
}
