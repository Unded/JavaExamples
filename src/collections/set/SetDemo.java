package collections.set;

import java.util.*;

public class SetDemo {
    public static void main(String[] args) {
        Thread t = Thread.currentThread();
        Thread.State state = t.getState();
        System.out.println(state);
        List<String> arr = new LinkedList<>();
        arr.add("10");
        arr.add("1");
        arr.add("15");
        arr.add("11");
        System.out.println(arr);

        //При Set<String> set = new HashSet<>(128, 1) выводится на экран[BBBB, AAAA, CCCC]
        //При Set<String> set = new HashSet<>(32, 1) выводится на экран[AAAA, BBBB, CCCC]
        Set<String> set = new HashSet<>();
        set.add("AAAA");
        set.add("BBBB");
        set.add("CCCC");
        System.out.println(set);

        List<String> data = Arrays.asList("A", "B", "C");
        List<Integer> vals = Arrays.asList(1, 2, 3);
        for (Iterator<String> it1 = data.iterator(); it1.hasNext(); ) {
            String element = it1.next();
            for (Iterator<Integer> it2 = vals.iterator(); it2.hasNext(); ) {
                System.out.print(element + it2.next() + ", ");
            }
        }

    }
}
