package exceptions.exceptionschain;

public class ChainExeptions {

    public static void demoMakeExc(){
        NullPointerException e = new NullPointerException("Top level exception");
        e.initCause(new ArithmeticException("it`s bad"));
        throw e;
    }

    public static void main(String[] args) {
        try {
            demoMakeExc();
        }catch (NullPointerException e){
            System.out.println("Exception catch " + e);
            System.out.println("cause is " + e.getCause());
        }
    }
}
