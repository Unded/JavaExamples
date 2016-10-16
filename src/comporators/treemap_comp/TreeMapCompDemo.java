package comporators.treemap_comp;

import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class TreeMapCompDemo {

    public static void main(String[] args) {

        TreeMap<String, Double> tm = new TreeMap<>(
                //Lambda fo sort keys by Surname
                (String o1, String o2) -> {
                    int i = o1.lastIndexOf(' ');
                    int j = o2.lastIndexOf(' ');
                    int k = o1.substring(i).compareToIgnoreCase(o2.substring(j));
                    if (k == 0)
                        return o1.compareTo(o2);
                    else return k;
                });
        tm.put("John Smith", 123.00);
        tm.put("Jay Gray", 5423.00);
        tm.put("Marry Spoon", 430.00);
        tm.put("Den Anderson", 3589.00);
        tm.put("Alan Smith", 9123.00);



        Set<Map.Entry<String, Double>> set = tm.entrySet();

        set.forEach(System.out::println);
    }
}
