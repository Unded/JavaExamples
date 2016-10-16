package io.simplelinereader;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class LineReader {

    public static void main(String[] args) {

        String str;
        ArrayList<String> arr = new ArrayList<>();

        try (BufferedReader reader = new BufferedReader(new InputStreamReader(System.in))) {

            System.out.println("Type some text (\"q - exit\"): ");

            do {
                str = reader.readLine();
                arr.add(str);
            } while (!("q").equalsIgnoreCase(str));


//            for (String arr2 : arr){
//                if (arr2.equalsIgnoreCase("q")) break;
//                else System.out.println(arr2);
//            }
            arr.stream().limit(arr.size() - 1).forEach(System.out::println);

        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
