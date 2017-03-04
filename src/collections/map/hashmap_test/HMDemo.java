package collections.map.hashmap_test;

import java.util.HashMap;
import java.util.Map;

public class HMDemo {

    public static void main(String[] args) {
        Map<PPerson, Integer> pMap = new HashMap<>();
        PPerson p0 = new PPerson("Kirill", 27);
        PPerson p1 = new PPerson("Elena", 27);
        PPerson p2 = new PPerson("Lena", 27);

        System.out.println(p0.name + " " + p0.hashCode());
        System.out.println(p1.name + " " + p1.hashCode());
        System.out.println(p2.name + " " + p2.hashCode());

        System.out.println("p1 == p2 is " + p1.equals(p2));

        pMap.put(p0, 1);
        pMap.put(p1, 2);
        pMap.put(p2, 3);

        System.out.println(pMap);

        p0.name = "Kir";

        System.out.println(pMap.get(p0));

        Map<String, String> map = new HashMap<>();

        map.put("0", "zero");
        map.put("idx", "xxx");

    }
}
