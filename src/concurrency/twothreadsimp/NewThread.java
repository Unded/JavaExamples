package concurrency.twothreadsimp;

public class NewThread implements Runnable{
    Thread t;

    NewThread(){
        t = new Thread(this, "SubThread");
        System.out.println("SubThread made: " + t);
        t.start();
    }

    @Override
    public void run() {
        try{
            System.out.println(t.getName());
            for (int i = 5; i > 0; i--){
                System.out.println("SubThread: " + i);
                Thread.sleep(500);
            }
        }catch (InterruptedException e) {
            System.out.println("SubThread stopped");
        }
        System.out.println("SubThread finish");
    }
}
