package stream_api.reduce_example.parallel_stream;

import java.util.ArrayList;
import java.util.List;

public class ParallelReduceDemo {
    public static void main(String[] args) {
        List<Double> arrParal = new ArrayList<>();
        arrParal.add(4.0);
        arrParal.add(4.0);
        arrParal.add(4.0);
        arrParal.add(4.0);
        arrParal.add(4.0);

        Double sqrt = arrParal.parallelStream().reduce(
                //Значение идентичности - значение,
                // которое будет выступать в роле аргумента "а"
                //в оперциях с "накопителя"
                1.0,
                //Накопитель
                (a, b) -> a * Math.sqrt(b),
                //Объедениетель
                (a, b) -> a + b);
        System.out.println(sqrt);

    }
}
