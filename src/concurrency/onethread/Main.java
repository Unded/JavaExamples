package concurrency.onethread;

public class Main {
    public static void main(String[] args) {
        Thread t = Thread.currentThread();
        System.out.println("This thread: " + t);

        t.setName("Main thread");
        t.setPriority(4);
        System.out.println("After update: " + t);

        try{
            for (int i = 5; i > 0; i--){
                System.out.println(i);
                Thread.sleep(1000);
            }
        }catch (InterruptedException e){
            System.out.println();
        }
    }
}
