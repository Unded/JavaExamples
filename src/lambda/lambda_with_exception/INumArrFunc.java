package lambda.lambda_with_exception;

public interface INumArrFunc {

    double arrFunc(double [] n) throws EmptyArrayException;

    class EmptyArrayException extends Exception{
        EmptyArrayException(){
            super("Array is empty.");
        }
    }
}
