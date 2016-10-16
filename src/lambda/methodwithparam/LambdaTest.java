package lambda.methodwithparam;

public class LambdaTest {

    public static void main(String[] args) {

        IObjTest obj = n -> (n % 2) == 0;

        if (obj.test(10)) System.out.println("10 - chet");
        if (obj.test(9)) System.out.println("9 - chet");
            else System.out.println("9 - nechet");

        obj = (n) -> n >= 0;
        for (int i = -3; i < 4; i++){
            if (i == 0){
                System.out.println(" " + i + " = 0");
                continue;
            }
            if (obj.test(i)) System.out.println(" " + i + " > 0");
                else System.out.println(i + " < 0 ");
        }
    }
}
