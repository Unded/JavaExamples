package concurrency.exchanger;

import java.util.concurrent.Exchanger;

public class SenderThread implements Runnable {

    Exchanger<String> ex;
    String str;

    SenderThread(Exchanger<String> exchanger){
        this.ex = exchanger;
        new Thread(this).start();
    }

    @Override
    public void run() {
        for (int i = 0; i < 3; i++) {
            double random = Math.random()*100;
            str = "" + random;
            System.out.println("Sending: " + str);
            try {
                //После выполнения метода exchange() поток остановится,
                //пока второй поток не получит данные.
                //Т.к. можно передать значение равное null,
                //этот метод можно использовать для синхронизации!!
                str = ex.exchange(str);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
