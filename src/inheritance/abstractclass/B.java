package inheritance.abstractclass;

class B extends A {

    private int k;

    B(int aa, int bb, int kk){
        super(aa, bb);
        k = kk;
    }

    @Override
    public int sum() {
        return getA() + getB() + k;
    }

    @Override
    public void show() {
        System.out.println("a = " + getA() + ", b = " + getB() + ", k = " + k);
    }

    @Override
    public void toNull() {
        super.toNull();
    }
}
