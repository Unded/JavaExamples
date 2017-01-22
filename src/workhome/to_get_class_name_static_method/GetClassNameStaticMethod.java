package workhome.to_get_class_name_static_method;

import java.lang.invoke.MethodHandles;
import java.util.Arrays;

public class GetClassNameStaticMethod {
    public static void main(String[] args) {
        System.out.println(Thread.currentThread().getStackTrace()[1].getClassName());

//        System.out.println(Thread.currentThread());
//        System.out.println(Arrays.toString(Thread.currentThread().getStackTrace()));
//        System.out.println(Thread.currentThread().getStackTrace().length);
//        for (StackTraceElement name : Thread.currentThread().getStackTrace()) {
//            System.out.println(name.getClassName());
//        }

        System.out.println(MethodHandles.lookup().lookupClass());
    }
}
