package Tests.wait_notify;

public class Consumer implements Runnable {
    Q q;
    Thread t;

    Consumer(Q q){
        this.q = q;
        t = new Thread(this, "Consumer");
        t.start();
    }

    @Override
    public void run() {
        while (true){
            q.get();
        }
    }
}
