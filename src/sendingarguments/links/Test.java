package sendingarguments.links;

public class Test {
    int a;
    int b;

    public Test(int first, int second) {
        a = first;
        b = second;
    }

    public void meth(Test test) {
        test.a *= 2;
        test.b *= 2;
    }


}
