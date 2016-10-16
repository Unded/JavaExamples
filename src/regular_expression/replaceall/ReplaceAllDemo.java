package regular_expression.replaceall;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ReplaceAllDemo {
    public static void main(String[] args) {
        String str = "Jon Jonathan Frank Todd";

        //Слова, начинающиеся с символов Jon и до пробела,
        //в методе replaceAll("Eric") будут заменены
        //на символы Eric
        // ? - будет заменено каждое совпадение
        // * - совпадений может быть несколько
        // . - все символы до пробела ВКЮЧИТЕЛЬНО
        Pattern pattern = Pattern.compile("Jon.*? ");

        //Если в шаблоне не указать пробел после символа "?",
        //то будут заменена только часть слова, полностью
        //соответствующая Шаблону
//        Pattern pattern = Pattern.compile("Jon.*?");

        Matcher matcher = pattern.matcher(str);

        System.out.println(str);
        System.out.println(matcher.replaceAll("Eric "));
    }
}
