package stream_api.collectors;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class CollectorsDemo {
    public static void main(String[] args) {
        List<NamePhoneEmail> fullList = new ArrayList<>();
        fullList.add(new NamePhoneEmail(1, "Adam", "123456789", "123@123"));
        fullList.add(new NamePhoneEmail(2, "Li", "663456789", "4423@123"));
        fullList.add(new NamePhoneEmail(3, "Marry", "553456789", "233@123"));
        fullList.add(new NamePhoneEmail(4, "Aida", "773456789", "663@123"));

        System.out.println("Initial NamePhoneEmail List:");
        //Вывести на экран значениея из списка fullList
        fullList.forEach(System.out::println);

        //Создать поток, в котором создаются экземпляры класса NamePhone
        //и в них записываются данные из списка fullList (только имя и номер телефона)
        Stream<NamePhone> namePhoneStream = fullList.stream().map(n -> new NamePhone(n.id, n.name, n.phone));
        //Создать список из данных взятых из потока
        List<NamePhone> npList = namePhoneStream.collect(Collectors.toList());
        System.out.println("\nPrint NamePhone List:");
        npList.forEach(System.out::println);

        //Создать поток
        namePhoneStream = fullList.stream().map(n -> new NamePhone(n.id, n.name, n.phone));
        //Для создания SortedSet<NamePhone> в классе NamePhone
        //необходимо переопределить метод compareTo(...)
        SortedSet<NamePhone> npSet = namePhoneStream.collect(Collectors.toCollection(TreeSet::new));
        System.out.println("\nPrint NamePhone SortedSet:");
        npSet.forEach(System.out::println);

        //Создать поток
        namePhoneStream = fullList.stream().map(n -> new NamePhone(n.id, n.name, n.phone));
        //Создать новый LinkedList<NamePhone>
        LinkedList<NamePhone> npLinkedList =
                namePhoneStream.collect(
                        //Создать новый LinkedList
                        LinkedList::new,
                        //Добавить в новый LinkedList элементы
                        LinkedList::add,
                        //Добавить все элементы из потока namePhoneStream в npLinkedList
                        LinkedList::addAll);
        System.out.println("\nPrint NamePhone LinkedList:");
        npLinkedList.forEach(System.out::println);
    }
}
