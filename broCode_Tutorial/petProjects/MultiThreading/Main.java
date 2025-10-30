import java.util.*;

public class Main {
    //Multithreading
    public static void main(String[] args) throws InterruptedException {
        //Multithreading
        Thread thread1 = new Thread(new MyRunnableMT("PING"));
        Thread thread2 = new Thread(new MyRunnableMT("PONG"));

        System.out.println("GAME START!!!");
        thread1.start();
        thread2.start();

        thread1.join();
        thread2.join();

        System.out.println("GAME OVER");
    }
}