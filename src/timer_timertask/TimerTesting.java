package timer_timertask;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.util.Formatter;
import java.util.Timer;

public class TimerTesting {
    public static void main(String[] args) {

        MyTimerTask mt = new MyTimerTask();
        Timer timer = new Timer();
        timer.schedule(mt, 100, 500);
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        timer.cancel();

        LocalTime time = LocalTime.now();
        LocalDate date = LocalDate.now();
        LocalDateTime dt = LocalDateTime.now();

//        Formatter formatter = new Formatter();
//        formatter.format("%s , now is %tT, %tD ", "Hello", time, date);
//        System.out.println(formatter);

        System.out.printf("%s, time: %2tT, date: %<tF \n", "Hello",dt );



    }
}
