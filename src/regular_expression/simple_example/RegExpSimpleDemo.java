package regular_expression.simple_example;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegExpSimpleDemo {
    public static void main(String[] args) {
        Pattern pattern;
        Matcher matcher;

        //Создать шаблон
        pattern = Pattern.compile("Java");
        System.out.println("Pattern: Java");

        //Создать "совпадение"
        //"Совпадение" должно полностью соответствовать шаблону
        matcher = pattern.matcher("Java");
        System.out.println("Mattcher: Java");

        if (matcher.find()) System.out.println("In pattern \"Java\" match is found");
            else System.out.println("In pattern \"Java\" match isn`t found");

        matcher = pattern.matcher("java");
        System.out.println("\nMattcher: java");
        if (matcher.find()) System.out.println("In pattern \"Java\" match is found");
        else System.out.println("In pattern \"Java\" match isn`t found");

        //Найта совпадения с Шаблоном во Входящей Последовательности
        //Шаблон
        pattern = Pattern.compile("and");
        //Входящая последовательность
        matcher = pattern.matcher("Java and PHP and JavaScript and many other programming languages");
        //Счетчик
        int i = 0;
        System.out.println("\nPattern: and");
        System.out.println("Matcher: Java and PHP and JavaScript and many other programming languages");
        while (matcher.find()){
            System.out.println("Match " + ++i + " was found, start at "
                                + matcher.start() + " index, end at " + matcher.end() + " index.");

        }
    }
}
