package concurrency.threadext;


public class Main {

    public static void main(String[] args) {
        MarketNews mn = new MarketNews("Market News");
        mn.start();

        Portfolio p = new Portfolio("Portfolio date");
        p.start();

        System.out.println("Finish!");


    }
}
