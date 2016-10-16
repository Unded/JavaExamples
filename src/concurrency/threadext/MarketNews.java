package concurrency.threadext;

public class MarketNews extends Thread {

    public MarketNews(String threadName){
        super(threadName);
    }

    @Override
    public void run() {
        System.out.println("The stock market is improving!");
    }
}
