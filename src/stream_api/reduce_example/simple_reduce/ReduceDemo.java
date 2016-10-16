package stream_api.reduce_example.simple_reduce;

import java.util.ArrayList;
import java.util.List;
import java.util.OptionalDouble;
import java.util.function.BinaryOperator;

public class ReduceDemo {
    public static void main(String[] args) {
        List<Integer> arr = new ArrayList<>();
        arr.add(10);
        arr.add(1);
        arr.add(16);
        arr.add(65);
        arr.add(132);
        arr.add(7);
        arr.add(20);
        arr.add(34);
        //Return Optional<T> value, if use .orElse(...) don`t need .isPresent() method
        Integer sum = arr.stream().reduce((s1, s2) -> s1 + s2).orElse(0);
        System.out.println("Sum = " + sum);
        double average = sum / arr.size();
        System.out.println("Average = " + average);

        Integer min = arr.stream().reduce((s1, s2) -> s1 < s2 ? s1 : s2).orElse(0);
        System.out.println("Min = " + min);

        Integer max = arr.stream().reduce((s1, s2) -> s1 > s2 ? s1 : s2).orElse(0);
        System.out.println("Max = " + max);

        List<String> strArr = new ArrayList<>();
        strArr.add("1");
        strArr.add("2");
        strArr.add("3");
        strArr.add("4");
        strArr.add("5");
        strArr.add("6");
        //Find average value of String array and
        //cast it to Integer (at first)and Integer cast to double
        //method average() return OptionalDouble value
        OptionalDouble aver = strArr.stream().mapToInt(Integer::parseInt).average();
        if (aver.isPresent()) System.out.println(aver.getAsDouble());

    }
}
