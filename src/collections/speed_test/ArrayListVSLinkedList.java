package collections.speed_test;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class ArrayListVSLinkedList {

    final static int LIST_LENGTH = 100_000;
    final static int OPERATION_COUNT = 100_000;

    public static void main(String[] args) {
        List<String> list = new ArrayList<>(); //Time = 2 mSec
//        List<String> list = new LinkedList<>(); // Time = 7000 mSec


        int elementIndex = LIST_LENGTH / 2;
        for (int i = 0; i < LIST_LENGTH; i++) {
            list.add("A");
        }

        long startTime = System.currentTimeMillis();
        for (int i = 0; i < OPERATION_COUNT; i++) {
            list.get(elementIndex);
        }
        long endTime = System.currentTimeMillis();
        System.out.println("time: " + (endTime - startTime));
    }
}
