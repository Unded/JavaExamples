package recurs;

public class Main {
    public static void main(String[] args) {
        Recurs obj = new Recurs(10);

        for (int i = 0; i < 10; i++) obj.values[i] = i;
        obj.printArr(10);
    }
}
