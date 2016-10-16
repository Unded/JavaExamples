package concurrency.wait_notify.surprise;

public class NewThread implements Runnable {

    private SyncObj object;

    NewThread(SyncObj object){
        this.object = object;
    }

    @Override
    public void run() {
        System.out.println("own :: Thread starting");
        object.process();
    }
}
