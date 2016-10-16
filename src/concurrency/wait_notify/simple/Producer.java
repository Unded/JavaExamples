package concurrency.wait_notify.simple;

public class Producer implements Runnable{
    Q q;

    Producer(Q q){
        this.q = q;
        new Thread(this, "Producer").start();
    }

    @Override
    public void run() {
        int i = 0;
        while (i <= 5) {
            q.put(i++);
        }


    }

}
