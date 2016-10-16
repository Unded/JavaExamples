package inheritance.abstractclass;


class Main {

    public static void main(String[] args) {
        B b = new B(1, 2, 156);
        b.show();
        System.out.println("sum = " + b.sum());
        b.toNull();
    }
}
