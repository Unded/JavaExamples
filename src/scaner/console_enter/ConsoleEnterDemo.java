package scaner.console_enter;

import java.util.Scanner;

public class ConsoleEnterDemo {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int inc = 0;
        double sum = 0;

        System.out.println("For get average, type number and press Enter.\nFor exit type \"q\"");

        while (scan.hasNext()){
            if (scan.hasNextDouble()){
                sum += scan.nextDouble();
                inc++;
            }else {
                String s = scan.next();
                if (("q").equalsIgnoreCase(s)) break;
                else System.out.println("Wrong symbol. Type numbers");
            }
        }
        System.out.println("Average = " + sum/inc);

    }
}
