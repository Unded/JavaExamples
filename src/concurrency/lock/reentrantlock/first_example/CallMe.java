package concurrency.lock.reentrantlock.first_example;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class CallMe {

    Lock methodLock = new ReentrantLock();

    public void call(String msg) {
        methodLock.lock();
        System.out.print("[" + msg);
        try{
            Thread.sleep(1);
        } catch (InterruptedException e) {
            System.out.println("Stopped");
        }
        System.out.println("]");
        methodLock.unlock();
    }
}
