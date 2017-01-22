package workhome.core_virt_methods;

/**
 Если в Классе "С" поля инициированы в конструкторе и метод f() не переопределен, то результат:
 workhome.virt_methods.A : 20
 workhome.virt_methods.B : 40
 workhome.virt_methods.C : 60

 Если в Классе "С" поля инициированы изначально, то результат будет:
 workhome.virt_methods.A : 20
 workhome.virt_methods.B : 40
 workhome.virt_methods.C : 20
*/

public class Demo {
    public static void main(String[] args) {
        Demo demo = new Demo();
        A a = new A();
        A b = new B();
        C c = new C();
        demo.g(a);
        demo.g(b);
        demo.g(c);
    }

    private void g(A element) {
        System.out.println(element.getClass().getName()+ " : " + element.f());
    }

}
