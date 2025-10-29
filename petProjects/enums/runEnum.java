import java.util.*;

public class runEnum {
    public static void main(String[] args) {
        // Enums = (Enumerations) A special kind of class
        // that represent a fixed set of constants
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a day of the week: ");
        String response = scanner.nextLine().toUpperCase();

        Day day =  Day.valueOf(response);

        switch(day){
            case MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY -> System.out.println("it's weekday");
            case SATURDAY, SUNDAY -> System.out.println("it's weekend");
        }

        scanner.close();

    }
}