package concurrency.callable;

import java.util.concurrent.Callable;

public class PortfolioCallable implements Callable<Integer> {
    @Override
    public Integer call() throws Exception {
        for (int i = 0; i < 5; i++) {
            Thread.sleep(700);
            System.out.println("You have " + (500 + i) + " shares of IMB");
        }
        return 10;
    }
}
