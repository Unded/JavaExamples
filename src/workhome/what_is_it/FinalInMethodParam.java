package workhome.what_is_it;

public class FinalInMethodParam {
    public static void main(String[] args) {
        System.out.println(f(10));
    }

    private static int f(final int i) {
        System.out.println(i);
        int tmp = i;
        System.out.println(tmp);
        tmp = Integer.MAX_VALUE;
        System.out.println(tmp + " " + i);
        int result = tmp;
        System.out.println(i);
        return result;
    }
}
