package map.tree_map;

import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class TreeMapDemo {

    public static void main(String[] args) {
        TreeMap <String, Double> tm = new TreeMap<>();

        tm.put("John", 123.00);
        tm.put("Jay", 5423.00);
        tm.put("Marry", 430.00);
        tm.put("Den", 3589.00);
        tm.put("Alan", 9123.00);

        Set<Map.Entry<String, Double>> setMap = tm.entrySet();

        for (Map.Entry<String, Double> me :setMap) {
            System.out.println(me.getKey() + " : " + me.getValue());
        }

        double balance = tm.get("Alan");
        tm.put("Alan", balance + 5555.98);
        System.out.println("\nAlan : " + tm.get("Alan"));





    }

}
