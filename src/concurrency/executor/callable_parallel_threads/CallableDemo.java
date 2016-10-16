package concurrency.executor.callable_parallel_threads;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class CallableDemo {
    public static void main(String[] args) {
        ExecutorService exSr = Executors.newFixedThreadPool(1);
        System.out.println("Start");
        Future<Integer> fFact = exSr.submit(new Factorial(6));
        Future<Double> fSum = exSr.submit(new Sum(6.0, 11.5));
        Future<Double> fHyp = exSr.submit(new Hypot(6.9, 3.2));

        try{
            System.out.println("Sum = " + fSum.get());
            System.out.println("Factorial = " + fFact.get());
            System.out.println("Hypot = " + fHyp.get());
        } catch (InterruptedException e) {
            e.printStackTrace();
        } catch (ExecutionException e) {
            e.printStackTrace();
        }

        exSr.shutdown();
        System.out.println("Threads Finished");
    }
}
