package concurrency.stopme;

public class MarketNews extends Thread {

    private volatile boolean stopMe = false;

    public void setStopMe(){
        stopMe = true;
    }

    public MarketNews(String threadName){
        super(threadName);
    }

    @Override
    public void run() {
    int i = 0;
            try {
                System.out.println("Let`s go!!!");
                do {

                    System.out.println("Now: " + i);
                    Thread.sleep(100);
                    i++;
                }while (!stopMe);
            } catch (InterruptedException e) {
                System.out.println("Something wrong ... ");
            }
    }
}
