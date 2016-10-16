package concurrency.stopme;


public class Main {

    public static void main(String[] args) {
        MarketNews mn = new MarketNews("Market News");
        mn.start();

        Portfolio p = new Portfolio("Portfolio date");
        p.start();

        try{
            Thread.sleep(1000);
            mn.setStopMe();
            mn.join();
            p.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("Finish!");
    }
}
