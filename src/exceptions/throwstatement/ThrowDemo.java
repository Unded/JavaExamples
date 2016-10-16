package exceptions.throwstatement;

public class ThrowDemo {

    static void demoThrow(){
        try{
            throw new NullPointerException("demo");
        }catch (NullPointerException e){
            System.out.println("exception is done");
            // Генерируем нове исключение, которое перехватим в методе main
            throw new ArrayIndexOutOfBoundsException("123456789");

        }
    }

    public static void main(String[] args) {
        try{
            demoThrow();
        }catch (ArrayIndexOutOfBoundsException e){
            System.out.println("new : " + e);
        }
    }


}
