package observer_observable;

import java.util.Observable;
import java.util.Observer;

public class Supervisor implements Observer {
    @Override
    public void update(Observable o, Object arg) {
        System.out.println("Update called, count = " + (Integer) arg);
    }
}
