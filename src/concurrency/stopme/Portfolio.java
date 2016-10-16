package concurrency.stopme;

public class Portfolio extends Thread {

    public Portfolio(String threadName){
        super(threadName);
    }

    @Override
    public void run() {
        try {
            this.sleep(500);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("You have 500 shares of IBM");
    }
}
