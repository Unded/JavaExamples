package exceptions.customexceptions;

public class CustomException extends Exception {
    private int details;

    CustomException(int a){
        details = a;
    }

    @Override
    public String toString() {
        return "CustomException (" + details + ")";
    }
}
