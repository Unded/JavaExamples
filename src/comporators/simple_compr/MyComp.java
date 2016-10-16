package comporators.simple_compr;

import java.util.Comparator;

public class MyComp implements Comparator<String> {
    @Override
    public int compare(String obj1, String obj2) {

        return obj2.compareTo(obj1);

    }
}
