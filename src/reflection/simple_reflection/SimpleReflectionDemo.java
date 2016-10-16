package reflection.simple_reflection;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class SimpleReflectionDemo {
    public static void main(String[] args) {
        try{
            //Получить объект Класса
            Class<?> c = Class.forName("java.awt.Dimension");
            System.out.println("  Class name: \n" + c.getName());
            //Получение Конструкторов Класса
            System.out.println("  Constructors: ");
            Constructor[] constructor = c.getConstructors();
            for (Constructor constr : constructor)
                System.out.println(constr);
            //Получение Полей Класса
            System.out.println("  Fields: ");
            Field[] fields = c.getFields();
            for (Field fl : fields)
                System.out.println(fl);
            //Получение Методов Класса
            System.out.println("  Methods: ");
            Method[] methods = c.getMethods();
            for (Method mth : methods)
                System.out.println(mth);

        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}
