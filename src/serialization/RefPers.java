package serialization;

import java.lang.reflect.Field;

public class RefPers {
    public static void main(String[] args) throws ClassNotFoundException {
        Class clazz = Class.forName("serialization.Person");
        System.out.println(clazz.getName());
        Field[] fields = clazz.getDeclaredFields();
        for (Field f : fields){
            System.out.println(f.getName());
            System.out.println(f.getModifiers());
        }
    }
}
