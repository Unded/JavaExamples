package lambda.lambdablock;

public class NumFuncDemo {
    public static void main(String[] args) {

        INumFunc numFunc;
        numFunc = i -> {
            int result = 1;
            for(int n = 1;n <= i;n++)
                result = n * result;
            return result;
        };

        System.out.println("Factorial 6 = " + numFunc.fack(6));

    }
}
