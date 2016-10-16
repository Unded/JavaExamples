package workhome.fib_nums;

public class FibonachiNums {
    public static void main(String[] args) {
        int num = 3;
//        System.out.println(num + " = " + fibNum(num));
        fibNum(3);
    }


    private static int fibNum(int number) {
        int result;
        if (number ==0 || number == 1 ){
            result = number ;
        }else {
            result = fibNum(number - 1) + fibNum(number - 2);
        }
        System.out.print( number);
        return result;
    }


//    private static int fibNum(int number) {
        /*The same that:

        if (number < 2){
            return number;
        }else {
            return fibNum(number - 1) + fibNum(number - 2);
        }*/
//        return number < 2 ? number : fibNum(number - 1) + fibNum(number - 2);
//    }
}
