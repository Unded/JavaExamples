package observer_observable;

import java.util.Observable;
import java.util.Observer;

public class Alarm implements Observer {
    @Override
    public void update(Observable o, Object arg) {
        if ((Integer)arg == 0) System.out.println("Big Bang!!!");
        else System.out.println("Selfhumiliation after : " + (Integer) arg);
    }
}
