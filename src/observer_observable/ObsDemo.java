package observer_observable;

public class ObsDemo {

    public static void main(String[] args) {

        BeginWatching bw = new BeginWatching(10);
        Supervisor sv = new Supervisor();
        Alarm alarm = new Alarm();
        bw.addObserver(sv);
        bw.addObserver(alarm);
        bw.counting();

    }

}
