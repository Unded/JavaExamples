package varargs;

public class Varargs {

    public void printing(int ... x){
        System.out.print("Array length is : " + x.length + " and arguments are : ");
        for (int y :x) System.out.print("" + y);
        System.out.println();
    }
}
