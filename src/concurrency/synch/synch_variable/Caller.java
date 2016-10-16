package concurrency.synch.synch_variable;

public class Caller implements Runnable {

    String msg;
    final CallMe target;
    Thread t;

    Caller(CallMe targ, String s){
        target = targ;
        msg = s;
        t = new Thread(this);
        t.start();
    }

    @Override
    public void run() {
        //Use SYNCH variable if can`t SYNCH method
        synchronized (target) {
            target.call(msg);
        }
    }


}
