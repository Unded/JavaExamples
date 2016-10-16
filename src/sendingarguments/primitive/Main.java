package sendingarguments.primitive;

public class Main {



    public static void main(String[] args) {

        int a = 10;
        int b = 20;

        System.out.println("beginning A = " + a);
        System.out.println("beginning B = " + b);

        Test test1 = new Test();

        test1.meth2(a, b);

        System.out.println("end A = " + a);
        System.out.println("end B = " + b);

//        test1.meth2(a, b);

    }
}
