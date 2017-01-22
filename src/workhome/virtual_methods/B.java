package workhome.virtual_methods;

public class B extends A{
    int a = 10;
    int b = 20;

    @Override
    void f(){
        System.out.println("B = " + (this.a + this.b));
    }
}
