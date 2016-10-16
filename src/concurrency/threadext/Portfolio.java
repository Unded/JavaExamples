package concurrency.threadext;

public class Portfolio extends Thread {

    public Portfolio(String threadName){
        super(threadName);
    }

    @Override
    public void run() {
        System.out.println("You have 500 shares of IBM");
    }
}
