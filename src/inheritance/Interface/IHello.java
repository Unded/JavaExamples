package inheritance.Interface;

public interface IHello {
    int x = 100;
    void sayHello();
    default void hiAll(){
        System.out.println("Hi All!");
    }
}
