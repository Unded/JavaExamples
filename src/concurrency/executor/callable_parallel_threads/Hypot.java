package concurrency.executor.callable_parallel_threads;

import java.util.concurrent.Callable;

public class Hypot implements Callable<Double> {
    double arg1, arg2;

    Hypot(Double arg1, Double arg2) {
        this.arg1 = arg1;
        this.arg2 = arg2;
    }


    @Override
    public Double call() throws Exception {
        return Math.sqrt((arg1 * arg1) + (arg2 * arg2));
    }
}
