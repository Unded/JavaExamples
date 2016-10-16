package regular_expression.split_method;

import java.util.Arrays;
import java.util.regex.Pattern;

public class SplitDemo {
    public static void main(String[] args) {
        Pattern pattern = Pattern.compile("[ ,.!?]");
        //Создает массив, элементом массива становятся символы,
        //которые разделены ШАБЛОНОМ
        // (пробелом, запятой, точкой, восклицательным или вопросительным знаками)
        String[] str = pattern.split("Hi,all!Is anyone here?Hello...");
        System.out.println(Arrays.toString(str));

    }
}
