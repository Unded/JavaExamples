package innerclasses;

public class Outer {
    static int outer_y = 235;
    int outer_x = 100;


    void test(){
        Inner inner = new Inner();
        inner.display();
    }

    static class Inner{
        void display(){
            Outer outer = new Outer();
            System.out.println("outer_x = " + outer.outer_x);
            System.out.println("outer_y = " + outer_y);
        }

    }
}
