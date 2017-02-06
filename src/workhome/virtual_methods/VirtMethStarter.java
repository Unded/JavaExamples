package workhome.virtual_methods;

public class VirtMethStarter {

    public static void main(String[] args) {
        A a = new A();
        a.f();

        A b = new B();
        b.f();

        byte bb = 127;
        System.out.println(++bb);


    }

}
