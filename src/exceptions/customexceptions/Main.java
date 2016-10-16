package exceptions.customexceptions;

public class Main {

    public static void makeException(int a) throws CustomException {
        System.out.println("Show method makeException (" + a + ")");
        if (a > 5) {
            throw new CustomException(a);
        }
        System.out.println("No exception!");
    }

    public static void main(String[] args) {
        try {
            makeException(1);
            makeException(10);
        } catch (CustomException e) {
            System.out.println("Found exception " + e.toString());
        }

    }
}
