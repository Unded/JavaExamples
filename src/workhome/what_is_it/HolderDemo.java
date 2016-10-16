package workhome.what_is_it;

public class HolderDemo {
    public static void main(String[] args) {
        Holder x = new Holder("A");
//        Holder y = new Holder(x.value); //sout(A A)
        Holder y = x; //sout(B B)
        y.value = "B";
        System.out.println(x.value + " " + y.value);
    }
}
