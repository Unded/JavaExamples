package concurrency.threadgroup;

public class ThreadGroupDemo {
    public static void main(String[] args) {
        // Create new ThreadGroup
        ThreadGroup group = new ThreadGroup("stub");

        //Define custom UncaughtExceptionHandler
        Thread.UncaughtExceptionHandler eh = (t, e) -> {
            System.out.println("eh - Something wrong!!!");
            //Interrupt all Threads in group
            group.interrupt();
            System.out.println("eh - All threads in group interrupted");
        };

        //MainThread set custom UncaughtExceptionHandler
        Thread mainThread = Thread.currentThread();
        mainThread.setUncaughtExceptionHandler(eh);

        //Create t0 Thread and add it into ThreadGroup
        Thread t0 = new Thread(group, () -> {
            try {
                int i = 0;
                while (true) {
                    Thread.sleep(100);
                    System.out.println("t0 - I am alive " + ++i);
                }
            } catch (InterruptedException e) {
                System.out.println("t0 - interrupted");
            }
        });
        //t0 set custom UncaughtExceptionHandler
        t0.setUncaughtExceptionHandler(eh);
        t0.start();

        //Create t1 Thread and add it into ThreadGroup
        Thread t1 = new Thread(group, () -> {
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("  t1 - throws Error.");
            throw new Error();
        });
        //t1 set custom UncaughtExceptionHandler
        t1.setUncaughtExceptionHandler(eh);
        t1.start();

        System.out.println("Main Thread finish");
    }
}
