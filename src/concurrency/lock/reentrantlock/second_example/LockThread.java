package concurrency.lock.reentrantlock.second_example;

import java.util.concurrent.locks.ReentrantLock;

public class LockThread implements Runnable {
    String name;
    ReentrantLock lock;

    LockThread(ReentrantLock lock, String name) {
        this.name = name;
        this.lock = lock;
        new Thread(this).start();
    }

    @Override
    public void run() {
        try {
            System.out.println("Thread " + name + " running");
            lock.lock();
            SharedResurse.count++;
            System.out.println("Thread " + name + " : " + SharedResurse.count);
            System.out.println("Thread " + name + " sleeping");
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }finally {
            System.out.println("Thread " + name + " unlock counter");
            lock.unlock();
        }
    }
}
