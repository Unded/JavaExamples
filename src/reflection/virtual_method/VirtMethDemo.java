package reflection.virtual_method;

import java.util.HashMap;

/**Тестирование работы виртуальных методов
 * -Получение полей Класса со значениями(в контексте Класса) через метод предка
 * -Получение полей наследника и предка (со значениеями) через метод предка с помощью рекурсии*/

public class VirtMethDemo {
    public static void main(String[] args) {
        System.out.println("A fields = " + new A().getClassFields());
        System.out.println("A super class fields = " + new A().getSuperClazzFields());
        System.out.println("B fields = " + new B().getClassFields());
        System.out.println("B super class fields = " + new B().getSuperClazzFields());
        System.out.println("C fields = " + new C().getClassFields());
        System.out.println("C super class fields = " + new C().getSuperClazzFields());
        System.out.println("\nGet ClassTree all fields by recurs: ");
        HashMap<String, String> data = new HashMap<>();
        System.out.println(new B().getClazzTreeFields(B.class, Object.class, data));
    }
}
