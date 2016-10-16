package inheritance.Interface;

public class Main {
    public static void main(String[] args) {
        IHello hello = new Hello();
        hello.sayHello();
        hello.hiAll();
        System.out.println(IHello.x);

        
    }
}
