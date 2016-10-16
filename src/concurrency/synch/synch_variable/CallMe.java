package concurrency.synch.synch_variable;

public class CallMe {

    //When can`t SYNCH method, SYNCH variable
    /*synchronized*/ void call(String msg) {
        System.out.print("[" + msg);
        try{
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            System.out.println("Stopped");
        }
        System.out.println("]");
    }
}
