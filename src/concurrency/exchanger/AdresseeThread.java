package concurrency.exchanger;

import java.util.concurrent.Exchanger;

class AddresseeThread implements Runnable{

    Exchanger<String> ex;
    String str;

    AddresseeThread(Exchanger<String> ex){
        this.ex = ex;
        new Thread(this).start();
    }

    @Override
    public void run() {
        for (int i = 0; i < 3; i++) {

            try {
                //Поток будет бездействовать пока другой поток не воспользуется
                //методом exchange() и только после этого поток продолжит свою работу
                str = ex.exchange("");
                System.out.println("Taken: " + str);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

    }
}

