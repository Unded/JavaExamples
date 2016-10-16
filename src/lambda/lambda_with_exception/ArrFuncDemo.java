package lambda.lambda_with_exception;

import java.util.Arrays;

public class ArrFuncDemo {

    public static void main(String[] args) throws INumArrFunc.EmptyArrayException {

        double[] arr1 = {1.0, 2.2, 3.3, 4.4, 5.5};
        double[] arr2 = new double[0];

        INumArrFunc arrFunc = n -> {
            double result = 0;

            if (n.length == 0) throw new INumArrFunc.EmptyArrayException();

            for (double x : n) {
                result += x;
            }
            return result / n.length;
        };

        System.err.println("arr1 = " + Arrays.toString(arr1));
        System.err.println("Average arr1 = " + arrFunc.arrFunc(arr1));

        System.err.println("arr2 = " + Arrays.toString(arr2));
        System.out.println("Average arr2 = " + arrFunc.arrFunc(arr2));


    }

}
