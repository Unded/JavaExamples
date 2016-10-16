package string_methods.substring;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.Arrays;
import java.util.Date;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        String obj = "This is a test. This is, too.";
        String search = "is";
        String sub = "was";
        String result = "";

        int i;

        do {
            System.out.println(obj);
            i = obj.indexOf(search);
            if (i != -1){
                result = obj.substring(0, i);
                result = result + sub;
                result = result + obj.substring(i + search.length());
                obj = result;
            }
        }while (i != -1);

        System.out.println(LocalDate.now() + " " + LocalTime.now());

    }

}
