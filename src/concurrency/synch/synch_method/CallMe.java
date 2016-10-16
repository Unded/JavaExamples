package concurrency.synch.synch_method;

public class CallMe {

    synchronized void call(String msg) {
        System.out.print("[" + msg);
        try{
            Thread.sleep(1000);
            Thread.yield();
        } catch (InterruptedException e) {
            System.out.println("Stopped");
        }
        System.out.println("]");
    }
}
