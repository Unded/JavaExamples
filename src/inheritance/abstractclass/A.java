package inheritance.abstractclass;

abstract class A {
    private int a;
    private int b;

    A(int aa, int bb){
        a = aa;
        b = bb;
    }

    public void toNull(){
        a = 0;
        b = 0;
        System.out.println("a = " + a + ", b = " + b);
    }

    public int getA() {
        return a;
    }

    public int getB() {
        return b;
    }

    abstract public int sum();

    abstract public void show();
}
