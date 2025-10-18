public class Car {

    String make = "Mini Cooper";
    String model = "Country man";
    int year = 2015;
    double price = 8000;
    boolean isRunning = false;

    void start() {
        isRunning = true;
        System.out.println("You start the engine!");
    }

    void stop() {
        isRunning = false;
        System.out.println("You stop the engine!");
    }

    void drive(){
        System.out.println("You drive the " + model);
    }

    void brake(){
        System.out.println("You brake the " + model);
    }
}