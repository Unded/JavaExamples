package concurrency.callable;

import java.util.concurrent.Callable;

public class MarketNewsCallable implements Callable<Integer> {

    @Override
    public Integer call() throws Exception {

        for (int i = 0; i < 5;i++ ){
            Thread.sleep(1000);
            System.out.println("The market is improving " + i);
        }
        return 12345;
    }
}
