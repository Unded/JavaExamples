package concurrency.twothreadsext;

public class NewThread extends Thread {

    NewThread(){
        super("SubThread");
        System.out.println("SubThread maked: " +this);
        start();
    }

    @Override
    public void run() {
        try{
            for (int i = 5; i > 0; i--){
                System.out.println("SubThread: " + i);
                //Mainthread возобновит свою работу только, когда
                // Subthread заснет, но не раньше!!!
                Thread.sleep(1000);
            }
        }catch (InterruptedException e) {
            System.out.println("SubThread stoped");
        }
        System.out.println("SubThread finish");
    }
}
