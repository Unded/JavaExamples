package concurrency.isalivejoin;

public class NewThread implements Runnable {

    String name;
    Thread t;

    NewThread(String threadName){
        name = threadName;
        t = new Thread(this, name);
        System.out.println("It`s alive!!! " + t);
        t.start();
        System.out.println(name + "thread in work:" + t.isAlive());
    }

    @Override
    public void run() {
        try{
            for (int i = 3; i > 0; i--){
                System.out.println(name + " : " + i);
                Thread.sleep(1500);
            }
        }catch (InterruptedException e) {
            System.out.println(name + " stoped");
        }
        System.out.println(name + " was finished");
    }
}
