package concurrency.wait_notify.example;

public class WaitingThread implements Runnable {

    private Object sync;
    private Data data;

    public WaitingThread(Object syncObj, Data data){
        this.sync = syncObj;
        this.data = data;
    }

    @Override
    public void run() {
        System.out.println("own :: Thread started");
        synchronized (sync){
            if (data.value == 0){
                try{
                    System.out.println("own :: Waiting");
                    sync.wait();
                    System.out.println("own :: Running again");
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
            System.out.println("own :: date.value = " + data.value);
        }
    }
}
