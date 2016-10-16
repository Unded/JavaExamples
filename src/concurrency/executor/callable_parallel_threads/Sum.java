package concurrency.executor.callable_parallel_threads;

import java.util.concurrent.Callable;

public class Sum implements Callable<Double> {
    double arg1, arg2;

    Sum(double arg1, double arg2){
        this.arg1 = arg1;
        this.arg2 = arg2;
    }

    @Override
    public Double call() throws Exception {
        return arg1 + arg2;
    }
}
