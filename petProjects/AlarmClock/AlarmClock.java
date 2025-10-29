import java.awt.*;
import java.time.LocalTime;

public class AlarmClock implements Runnable{

    private final LocalTime alarmTime;

    public AlarmClock(LocalTime alarmTime) {
        this.alarmTime = alarmTime;
    }

    @Override
    public void run(){

        while (LocalTime.now().isBefore(alarmTime)){
            try {
                Thread.sleep(1000);
                LocalTime now = LocalTime.now();

                System.out.printf("\rCurrent time: %02d:%02d:%02d", now.getHour(),
                        now.getMinute(),
                        now.getSecond());
                System.out.flush();
            } catch (InterruptedException e) {
                System.out.println("thread was interrupted");
            }
        }

        System.out.println("\n***ALARM NOISES***");
    }
}
