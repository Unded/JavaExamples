package concurrency.threadimp;

public class Main {

    public static void main(String[] args) {
        MarketNews2 mn2 = new MarketNews2();
        Thread mn  = new Thread(mn2, "Market News");
        mn.start();

        Runnable p2 = new Portfolio();
        Thread p = new Thread(p2, "Portfolio date");
        System.out.println(p.getName());
        p.start();

        System.out.println("Finish");


    }
}
