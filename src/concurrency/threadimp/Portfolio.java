package concurrency.threadimp;

public class Portfolio implements Runnable {


    @Override
    public void run() {
        System.out.println("You have 500 shares of IMB");
    }
}
