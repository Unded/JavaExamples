package collections;

// Created by nnm on 18.07.16.

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class Decart {
    public static void main(String[] args) {
        List<String> m0 = new ArrayList<>(Arrays.asList("A", "B", "C"));
        List<String > m1 = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            m1.add("" + i);
        }


        Iterator<String> itM0 = m0.iterator();
        Iterator<String> itM1 = m1.iterator();
        List<String> result = new ArrayList<>();
        List<String> swap = new ArrayList<>();
        while (itM0.hasNext()) {
            String element = itM0.next();
            if (itM1.hasNext()){
                while (itM1.hasNext()) {
                    String swapElement = itM1.next();
                    swap.add(swapElement);
                    result.add(element + swapElement);
                }
            }else{
                for (int i = 0; i < swap.size(); i++){
                    result.add(element + swap.get(i));
                }
            }

        }
        System.out.println(result);
    }
}
