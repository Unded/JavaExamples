package concurrency.twothreadsimp;

public class Main {
    public static void main(String[] args) {
        Thread t = Thread.currentThread();
        new NewThread();

        try {
            System.out.println(t.getName().toUpperCase());
            for (int i = 5; i > 0; i--) {
                System.out.println("MainThread: " + i);
                Thread.sleep(1000);
            }
        } catch (InterruptedException e) {
            System.out.println("MainThread stoped");
        }
        System.out.println("MainThread finished");

    }
}
