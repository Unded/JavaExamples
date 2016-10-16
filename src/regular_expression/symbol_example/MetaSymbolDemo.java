package regular_expression.symbol_example;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class MetaSymbolDemo {
    public static void main(String[] args) {
        //Шаблон сопосавим с символами W одним или несколькоми подряд
        // + это одно или более совпадений
        Pattern pattern = Pattern.compile("W+");
        Matcher matcher = pattern.matcher("WWW WW W");

        //Вывести на экран совпавшую с Шаблоном символьную строку
        while (matcher.find())
            //Метод group() возвращает совпавшую с Шаблоном симвльную строку
            System.out.println(matcher.group());

        //Шаблон сопоставим со строкой, начинающейся с символа "t", после которого
        //следуют любые символы, а заканчивается строка символом "d"(символов может быть насколько)
        //Метод find() ищет последоватьельность самой большой длинны
        //Это СТРОГОЕ совпадение
        pattern = Pattern.compile("t.+d");
        matcher = pattern.matcher("term electricity was introduced in 1600. the end");
        while (matcher.find())
            System.out.println(matcher.group());

        //Если добавить в шаблон символ "?" совпадение становится НЕСТРОГИМ
        pattern = Pattern.compile("t.+?d");
        matcher = pattern.matcher("term electricity was introduced in 1600. the end");
        while (matcher.find())
            System.out.println(matcher.group());

        //Поиск шаблона по словам, сотоящих из символов от 0-z
        //На экран будут выведены слова, состоящие из заглавных и строчных буки
        // и цифр, без знаков препинания
        pattern = Pattern.compile("[0-z]+");
        matcher = pattern.matcher("Term electricity was introduced in 1600. the end");
        while (matcher.find())
            System.out.println(matcher.group());
    }
}
