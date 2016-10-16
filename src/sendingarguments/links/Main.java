package sendingarguments.links;

public class Main {

    private static int a = 10;
    private static int b = 20;

    public static void main(String[] args) {

        Test test1 = new Test(a, b);
        System.out.println("At the beginning testA = " + test1.a);
        System.out.println("At the beginning testB = " + test1.b);

        test1.meth(test1);

        System.out.println("At the end testA = " + test1.a);
        System.out.println("At the end testB = " + test1.b);

        System.out.println(a + " " + b);
    }
}
