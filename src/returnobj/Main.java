package returnobj;

public class Main {

    public static void main(String[] args) {
        Test obj1 = new Test(2);
        Test obj2;

        obj2 = obj1.incTen();
        System.out.println(obj1.a);
        System.out.println(obj2.a);
        
        obj2 = obj2.incTen();
        System.out.println(obj2.a);
    }
}
