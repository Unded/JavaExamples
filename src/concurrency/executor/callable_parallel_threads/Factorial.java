package concurrency.executor.callable_parallel_threads;

import java.util.concurrent.Callable;

public class Factorial implements Callable<Integer> {
    int arg;

    Factorial(int arg){
        this.arg = arg;
    }

    @Override
    public Integer call() throws Exception {
        int fact = 1;
        for (int i = 2; i <= arg; i++){
            fact *= i;
        }
        return fact;
    }
}
