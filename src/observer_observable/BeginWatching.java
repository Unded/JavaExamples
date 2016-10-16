package observer_observable;


import java.util.Observable;

public class BeginWatching extends Observable {

    private int period;

    BeginWatching(int p){
        period = p;
    }

    void counting (){
        for (; period >= 0; period--){
            setChanged();
            notifyObservers(period);
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
