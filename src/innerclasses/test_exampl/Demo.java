package innerclasses.test_exampl;

public class Demo {
    int x = 100;
    static private int y = 1100;

    public static void main(String[] args) {
        Demo.Inner in = new Demo().new Inner();
        in.f();

        StaticNested st = new StaticNested();
        st.g();
    }

    class Inner {
        int a = 100;
        void f() {
            System.out.println(x * x);
        }
    }

    static class StaticNested{
        static void g(){
            System.out.println(y * y * y);
        }
    }

}
