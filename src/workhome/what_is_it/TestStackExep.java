package workhome.what_is_it;

public class TestStackExep {
    public static void main(String[] args) {
        for (int i = 0; i < 10; i++) {
            System.out.println(i);

        }
        try{
            throw new Exception();
        }catch (Exception e){
            throw new Exception();
        }finally {
            throw new RuntimeException();

        }
    }
}
