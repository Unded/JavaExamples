package lambda.simple;

import static java.lang.System.out;

public class LambdaDemo {
    public static void main(String[] args) {
        IMyNum<Double> myNumObj;

        myNumObj = () -> 123.11;

        out.println(myNumObj.getObj());

        myNumObj = () -> Math.random() * 100;
        out.println(myNumObj.getObj());
        out.println(myNumObj.getObj());
        out.println(myNumObj.getObj());
        out.println(myNumObj.getObj());

        IMyNum<String> myStrObj;

        myStrObj = () -> "123_It_is_testing";
        out.println(myStrObj.getObj());

        IMyNum <String> str = new IMyNum<String>() {
            @Override
            public String getObj() {
                return "Hi all!";
            }
        };
        System.out.println(str.getObj());

    }
}
