import java.util.Scanner;

public class user_choice {
    public static void main(String[] args) {
        //user choice weekday

        Scanner scanner =  new Scanner(System.in);
        int day = 0;

        System.out.println("Enter 1 to 7: ");
        day = scanner.nextInt();

        switch(day) {
            case 1 -> System.out.println("Monday");
            case 2 -> System.out.println("Tuesday");
            case 3 -> System.out.println("Wednesday");
            case 4 -> System.out.println("Thursday");
            case 5 -> System.out.println("Friday");
            case 6 -> System.out.println("Saturday");
            case 7 -> System.out.println("Sunday");
            default -> System.out.println("Incorrect Input");
        }
    }
}