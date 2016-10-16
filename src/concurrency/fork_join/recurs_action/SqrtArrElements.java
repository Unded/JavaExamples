package concurrency.fork_join.recurs_action;

import java.util.concurrent.RecursiveAction;

public class SqrtArrElements extends RecursiveAction {

    int threshold = 100;
    double[] data;
    int start, end;

    SqrtArrElements(double[] vals, int start, int end){
        this.data = vals;
        this.start = start;
        this.end = end;
    }

    @Override
    protected void compute() {
        if ((end - start) < threshold){
            for (int i = start; i < end; i++){
                data[i] = Math.sqrt(data[i]);
            }
        }else {
            //Найти середину куска массива
            int middle = (start + end) / 2;
            //Разделить массив (или отрезок из массива) пополам и
            //запустить "расчеты" для двух отрезков
            //от начала отрезка до середины, от середины до конца отрезка
            invokeAll(new SqrtArrElements(data, start, middle),
                    new SqrtArrElements(data, middle, end));
        }
    }
}
