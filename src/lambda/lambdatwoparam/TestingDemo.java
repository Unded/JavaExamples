package lambda.lambdatwoparam;

public class TestingDemo {

    public static void main(String[] args) {

        ITesting obj;
        obj = (x, y) -> Math.sqrt(x - y);

        System.out.println(obj.getResult(10, 6.));


    }
}
