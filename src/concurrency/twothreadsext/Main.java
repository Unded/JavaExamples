package concurrency.twothreadsext;

public class Main {
    public static void main(String[] args) {
        new NewThread();

        try{
            Thread.sleep(1000);
            for (int i = 5; i > 0; i--) {
                System.out.println("MainThread: " + i);
                //Subthread начнет работать только тогда, когда
                // Mainthread заснет, но не раньше!
                Thread.sleep(1000);
            }
        } catch (InterruptedException e) {
            System.out.println("MainThread stoped");
        }
        System.out.println("MainThread finished");
    }
}
