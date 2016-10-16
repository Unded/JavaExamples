package workhome.what_is_it;

public class Demo {
    public static void main(String[] args) {
        System.out.println(f1(10,10));
        System.out.println(f2(10,10));
    }

    //Суммирование двух положительных чисел
    private static int f1(int x, int y) {
        if (y == 0){
            return x;
        }else {
            return f1(x + 1, y - 1);
        }
    }

    //Умножение двух положительных чисел
    private static int f2(int x, int y){
        if (y == 1){
            return x;
        }else {
            return x + f2(x, y -1);
        }
    }
}
