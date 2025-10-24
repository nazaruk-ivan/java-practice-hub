import java.util.Scanner;
import java.util.Timer;
import java.util.TimerTask;

public class Main {
    public static void main(String[] args) {
        // Timer, TimerTask
        //good for sending notifications, schedule updates, etc.

        Timer timer = new Timer();
        TimerTask task = new TimerTask(){
            @Override
            public void run(){
                System.out.println("hello!");
            }
        };

        timer.schedule(task,0 ,3000);  //3000 miliseconds it takes to display hello each time or do whats inside task
    }
}