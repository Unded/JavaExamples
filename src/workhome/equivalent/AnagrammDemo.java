package workhome.equivalent;

public class AnagrammDemo {
    public static void main(String[] args) {
        AnagrammHS an = new AnagrammHS("ABC");
        System.out.println(an.equals("B"));

        AnagrammArrSort anSr = new AnagrammArrSort("ABC");
        System.out.println(anSr.equals("BCA"));
        System.out.println(anSr.equals("CAB"));
        System.out.println(anSr.equals("XYZ"));
        System.out.println(anSr.equals("BAC"));
    }
}
