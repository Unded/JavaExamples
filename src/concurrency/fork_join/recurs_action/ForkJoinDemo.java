package concurrency.fork_join.recurs_action;

import java.util.concurrent.ForkJoinPool;

public class ForkJoinDemo{
    public static void main(String[] args) {
        //Make new pool
//        ForkJoinPool fjp = new ForkJoinPool();

        //Use default (common) pool
//        ForkJoinPool fjp = ForkJoinPool.commonPool();
        ForkJoinPool fjp = new ForkJoinPool();
        double [] data = new double[100000];
        for (int i = 0; i < data.length; i++){
            data[i] = i;
        }
        System.out.println("Part of array from 0 to 10:");
        for (int i = 0; i < 10; i++){
            System.out.print(data[i] + " ");
        }
        SqrtArrElements task = new SqrtArrElements(data, 0, data.length);

        //Can delete variable fjp and use next code line
//        task.invoke();

        //Start main task of ForkJoinTask to execution
        long startT = System.currentTimeMillis();
        fjp.invoke(task);
        long endT = System.currentTimeMillis();
        System.out.println("\n\nParalelism level: "+ fjp.getParallelism() + ", time = " + (endT - startT));
        System.out.println("\nPart of array after transformation");
        //Part of array after transformation
        for (int i = 0; i < 10; i++)
            System.out.printf("%.2f ", data[i]);

    }
}
