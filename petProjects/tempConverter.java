import java.util.Scanner;

public class tempConverter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("1. Celsius to Fahrenheit");
        System.out.println("2. Fahrenheit to Celsius");
        System.out.print("Choose an option (1 or 2): ");
        int choice = scanner.nextInt();

        System.out.print("Enter temperature: ");
        double temp = scanner.nextDouble();
        double result;

        if (choice == 1) {
            result = (temp * 9/5) + 32;
            System.out.println("Temperature in Fahrenheit: " + result);
        } else if (choice == 2) {
            result = (temp - 32) * 5/9;
            System.out.println("Temperature in Celsius: " + result);
        } else {
            System.out.println("Invalid option");
        }

        scanner.close();
    }
}