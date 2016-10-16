package concurrency.synch.synch_method;

public class Caller implements Runnable {

    String msg;
    CallMe target;
    Thread t;

    Caller( CallMe targ, String s){
        target = targ;
        msg = s;
        t = new Thread(this);
        t.start();
    }

    @Override
    public void run() {
        target.call(msg);
    }


}
