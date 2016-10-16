package comporators.treemap_with_thencomp;

import java.util.*;

public class ThenCompDemo {
    public static void main(String[] args) {

        Comparator<String> comp =
                //Lambda fo sort keys by Surname
                (String o1, String o2) -> {
                    int i = o1.lastIndexOf(' ');
                    int j = o2.lastIndexOf(' ');
                    return  o1.substring(i).compareToIgnoreCase(o2.substring(j));
                };
//        Comparator <String> thenComp = (o1, o2) -> o1.compareTo(o2);
        Comparator <String> thenComp = String::compareTo;

        TreeMap<String, Double> tm = new TreeMap<>(comp.thenComparing(thenComp));
        tm.put("John Smith", 123.00);
        tm.put("Jay Gray", 5423.00);
        tm.put("Marry Spoon", 430.00);
        tm.put("Den Anderson", 3589.00);
        tm.put("Alan Smith", 9123.00);

        Set<Map.Entry<String, Double>> set = tm.entrySet();

        set.forEach(System.out::println);
    }
}
