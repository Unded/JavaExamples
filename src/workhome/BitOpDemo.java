package workhome;

public class BitOpDemo {
    public static void main(String[] args) {
        int i = 0b1000001_00000011_00000111_10001111;
        System.out.println(i);
        byte b = (byte) i;
        System.out.println(b);
        System.out.println(Integer.toBinaryString(b /*& 0xFF*/));
    }
}
