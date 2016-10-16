package concurrency.wait_notify.example;

public class SyncTest {

    public static void main(String[] args) {
        System.out.println("main :: Start");

        Object sync = new Object();
        Data data = new Data();

        Thread t = new Thread(new WaitingThread(sync, data));
        t.start();

        try{
            System.out.println("main :: Sleeping");
            Thread.sleep(500);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        synchronized (sync){
            System.out.println("main :: value to 1");
            data.value = 1;
            System.out.println("main :: Notifying thread");
            sync.notify();
            System.out.println("main :: Thread notified");
        }


    }
}
