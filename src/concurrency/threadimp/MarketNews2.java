package concurrency.threadimp;

public class MarketNews2 implements Runnable {


    @Override
    public void run() {
        System.out.println("The stock market is improving!");
    }
}
