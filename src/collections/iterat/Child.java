package collections.iterat;


public class Child extends Parent {
    String str = "Child";

    Child(){
        super(12, 20);
        super.str = "WTF";
    }

    static void f(){
        System.out.println(100 +89);
    }
}
