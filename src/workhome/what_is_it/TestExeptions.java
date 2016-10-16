package workhome.what_is_it;

import java.nio.charset.Charset;

public class TestExeptions {
    public static void main(String[] args) {
        try {
            f();
        }catch (Exception e){
            System.out.println(1);
        }
        System.out.println("001");

    }

    private static void f() {
        try {
            g();
        }catch (Error e){
            System.out.println(10);
        }
        System.out.println(100500);
    }

    private static void g() {
//        throw new RuntimeException();
        throw new Error();
    }
}
