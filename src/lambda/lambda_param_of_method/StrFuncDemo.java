package lambda.lambda_param_of_method;

public class StrFuncDemo {

    static String strOpt(IStrFunc str, String s){
        return str.func(s);
    }

    public static void main(String[] args) {

        String strObj = "Lamda is good for Java";
        String strResult;
        System.out.println(strObj);

//        strResult = strOpt(str -> str.toUpperCase(), strObj);
//        System.out.println(strResult);

        strResult = strOpt(String::toUpperCase, strObj);
        System.out.println(strResult);

        strResult = strOpt(str -> {
            String result = "";
            for (int i = 0; i < str.length(); i++){
                if (str.charAt(i) != ' ')
                    result += str.charAt(i);
            }
            return result;
        },strObj);
        System.out.println(strResult);

        IStrFunc reverse = str -> {
            String result = "";
            for (int i = str.length() - 1; i >= 0; i--)
                result += str.charAt(i);
            return result;
        };

        strResult = strOpt(reverse, strObj);
        System.out.println(strResult);

    }
}
