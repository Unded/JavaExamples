package stream_api.iterator_and_spliterator;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Spliterator;

public class StreamIteratorDemo {
    public static void main(String[] args) {
        List<Integer> arr = new ArrayList<>();
        arr.add(1);
        arr.add(2);
        arr.add(3);
        arr.add(4);
        arr.add(5);
        arr.add(6);
        arr.add(7);
        arr.add(8);
        arr.add(9);
        arr.add(10);
        //Использовать Iterator
        Iterator<Integer> itr = arr.stream().iterator();
        System.out.println("Print Iterator: ");
        while (itr.hasNext())
            System.out.print(itr.next()+ " ");

        //Ипосльзовать Spliterator
        Spliterator<Integer> spl = arr.stream().spliterator();
        //Метод tryAdvance позволяет выполнять действия над каждым элементом
//        while (spl.tryAdvance(System.out::println));

        //Метод forEachRemaining выполняет заданное действие над всеми элементами
        System.out.println("\nPrint Spliterator: ");
        spl.forEachRemaining(n -> System.out.print(n + " "));

        spl = arr.stream().spliterator();
        Spliterator<Integer> splTry = spl.trySplit();
        System.out.println("\nPrint result of trySplit() method: ");
        if (splTry != null) splTry.forEachRemaining(n -> System.out.print(n + " "));

        System.out.println("\nPrint remain of Spliterator: ");
        spl.forEachRemaining(n -> System.out.print(n + " "));
    }

}
