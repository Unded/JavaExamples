package Tests.wait_notify;

public class Producer implements Runnable{
    Q q;
    Thread t;
    int i = 0;

    Producer(Q q, int n){
        this.i = n;
        this.q = q;
        t = new Thread(this, "Producer");
        t.start();
    }

    @Override
    public void run() {
        if (this.i <= 5)
            while (this.i <=5 ) q.put(i++);

    }

}
