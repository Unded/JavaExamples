package concurrency.fork_join.recurs_task;

import java.util.concurrent.RecursiveTask;

public class SumTask extends RecursiveTask<Double> {

    final int threshold = 500;
    double [] data;
    int start, end;

    SumTask(double[] data, int start, int end){
        this.start = start;
        this.end = end;
        this.data = data;
    }

    @Override
    protected Double compute() {
        double sum = 0;

        if ((end - start) < threshold){
            for (int i = start; i < end; i++){
                sum += data[i];
            }
        }else {
            int middle = (start + end) / 2;
            SumTask subTask1 = new SumTask(data, start, middle);
            SumTask subTask2 = new SumTask(data, middle, end);
            subTask1.fork();
            subTask2.fork();
            sum = subTask1.join() + subTask2.join();
        }

        return sum;
    }
}
