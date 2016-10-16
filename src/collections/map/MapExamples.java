package collections.map;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class MapExamples {
    public static void main(String[] args) {
//        Map<String, String> map = new HashMap<String, String>(){{put("1", "Kirill"); put("2", "Elena");}};
        Map<String, String> map = new HashMap<>();
        map.put("1", "Kirill");
        System.out.println(map);

        Map<String, String> newMap = Collections.singletonMap("2","Petrov");
        System.out.println(newMap);

    }
}
