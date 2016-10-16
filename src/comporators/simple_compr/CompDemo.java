package comporators.simple_compr;

import java.util.Comparator;
import java.util.TreeSet;

public class CompDemo {

    public static void main(String[] args) {
        MyComp mc = new MyComp();

        TreeSet<String> ts = new TreeSet<>();
       /* Make Lambda Comporator in TreeMap constructor
        TreeSet<String> ts = new TreeSet<>((aStr, bStr) -> bStr.compareTo(aStr));*/

        ts.add("A");
        ts.add("B");
        ts.add("C");
        ts.add("D");
        ts.add("E");
        ts.add("F");
        ts.add("G");

/*        Use Lambda to make Comporator
        Comparator<String> mc = (aStr, bStr) -> bStr.compareTo(aStr);*/

//        for (String element : ts){
//            System.out.println(element);
//        }

        ts.stream()
                //Sorted by MyComp
                .sorted(mc)
                //Replace For or Foreach loops
                .forEach(System.out::println);
    }
}
