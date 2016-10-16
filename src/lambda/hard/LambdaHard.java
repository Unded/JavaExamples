package lambda.hard;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class LambdaHard {
    public static void main(String[] args) {
        Stream.of("A12", "B6", "A3")
                .filter(s -> s.contains("A"))
                .map(String::length)
                .forEach(System.out::println);

        List<String> aa = Arrays.asList("A", "B", "C");
        List<String> ii = Arrays.asList("1", "2", "3", "4");
        List<String> ss = Arrays.asList("&", "#", "@");
        System.out.println(aa.spliterator().characteristics());
        aa.stream()
                .flatMap(a -> ii.stream()
                        .flatMap(b -> ss.stream()
                                .map(c -> Arrays.asList(a, b, c))))
//                .filter(n -> n.contains("1"))
                .forEach(System.out::println);

        //Сумма всех элементов списка ii через Лямбда-выражение
        System.out.println(ii.stream()
                .flatMapToInt(p -> Arrays.stream(p.split(","))
                        .mapToInt(Integer::parseInt))
                .sum());
        //Сумма всех элементов списка ii через цикл
        int sum = 0;
        for (String anIi : ii) {
            sum += Integer.parseInt(anIi);
        }
        System.out.println(sum);

        List<String> data = Arrays.asList("B", "c", "d", "A");
        System.out.println(" test = " + data.stream().collect(Collectors.joining("; ", "{", "}")));
        data.stream().sorted(String::compareToIgnoreCase).forEach(System.out::println);

        Set<Person> listPerson = new TreeSet<>((o1, o2) -> o1.getName().compareToIgnoreCase(o2.getName()));
        listPerson.add(new Person("Lena", 25));
        listPerson.add(new Person("Kirill", 30));
        listPerson.add(new Person("Dima", 52));
        listPerson.forEach(System.out::println);

        Map<Integer, String> mapData = new WeakHashMap<>();
        Integer x = 1;
        mapData.put(x, "First");
        mapData.put(2, "Second");
        mapData.put(3, "Third");
        Set<Map.Entry<Integer, String>> set = mapData.entrySet();
        set.stream().sorted((a, b) -> b.getValue().compareTo(a.getValue())).forEach(System.out::println);

//        x = null;
//        set.forEach(System.out::println);
    }
}
