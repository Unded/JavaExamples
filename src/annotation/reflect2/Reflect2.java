package annotation.reflect2;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.reflect.Method;

@Retention(RetentionPolicy.RUNTIME)
@interface MyAnno{
    String str();
    int val();
}

public class Reflect2 {

    @MyAnno(str = "Annotation have two parameters", val = 100)
    public static void myMeth(String str, int i){

        Reflect2 obj = new Reflect2();
        try{
            Class<?> c = obj.getClass();

            Method m = c.getMethod("myMeth", String.class, int.class);

            MyAnno anno = m.getAnnotation(MyAnno.class);

            System.out.println(anno.str() + " " + anno.val() + " (" + anno.annotationType() + ")");

        } catch (NoSuchMethodException e) {
            e.printStackTrace();
        }

    }

    public static void main(String[] args) {
        myMeth("Text", 110);
    }

}
