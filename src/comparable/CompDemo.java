package comparable;

import java.util.ArrayList;
import java.util.List;

public class CompDemo {
    public static void main(String[] args) {
        Person p1 = new Person(1, "Lena");
        Person p2 = new Person(2, "Elena");

        List<Person> list = new ArrayList<>();
        list.add(p1);
        list.add(p2);


    }
}
