package stream_api.simple_example;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.stream.Stream;

public class SimpleStreamDemo {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(10);
        list.add(2);
        list.add(3);
        list.add(52);
        list.add(-11);
        list.add(66);
        list.add(40);
        list.add(1);
        System.out.println("Initial array condition");
        System.out.println(list.toString());

        Stream<Integer> lsStream = list.stream();

        Optional<Integer> minVal = lsStream.min(Integer::compare);
        if (minVal.isPresent()) System.out.println("\nMin value: " + minVal.get());

        //Т.к. после поиска minVal поток был завершен
        //нужно снова получить поток, тоесть создать новый
        lsStream = list.stream();
        Optional<Integer> maxVal = lsStream.max(Integer::compare);
        if (maxVal.isPresent()) System.out.println("Max value: " + maxVal.get());

        System.out.print("Sorted list: ");
        //Создание нового потока, сортировка от большего к меньшему и вывод на экран
        list.stream().sorted().forEach(n -> System.out.print(n + ", "));

        //Вывод значени больше 10
        System.out.print("\nPrint elements > 10 : ");
        //Создание нового потока, сортировка от большего к меньшему
        //фильтрация элементов больше 10 и вывод результата на экран
        list.stream().sorted().filter(n -> n > 10).forEach(n -> System.out.print(n + ", "));

    }
}
