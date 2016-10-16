package Tests;

public class Secu {
    Secu() { System.out.print("c "); }
    static { System.out.print("y "); }

    public static void main(String[] args) {
        new Secu().go();
    }
    void go() { System.out.print("g "); }
     { System.out.print("x "); }
}
