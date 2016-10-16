package concurrency.callable;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class Main {
    public static void main(String[] args) {

            List<Future<Integer>> futures = new ArrayList<>();
            List<Integer> results = new ArrayList<>();

            final ExecutorService service = Executors.newFixedThreadPool(2);

            try {
                futures.add(service.submit(new PortfolioCallable()));
                futures.add(service.submit(new MarketNewsCallable()));
                for (Future<Integer> future : futures) {
                    results.add(future.get());
                }
            } catch (InterruptedException e) {
                e.printStackTrace();
            } catch (ExecutionException e) {
                e.printStackTrace();
            } finally {
                service.shutdown();
            }

            for (Integer res : results) {
                System.out.println("Got the result: " + res);
            }
    }
}
