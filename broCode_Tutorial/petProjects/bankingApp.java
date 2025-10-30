import java.util.Random;
import java.util.Scanner;

public class bankingApp {
    static int x = 4;
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        //banking program

        //steps: declare variables, display menu, get and process users choice

        //showBalance()

        //makeDeposit()

        //withdraw()

        //exit
        double balance = 0;
        boolean isRunning = true;
        int choice;

        while (isRunning) {
            System.out.println(">>>>>>>>>>>>>>>>>>>>>>>>>>");
            System.out.println("Welcome to the Nazaruk Banking");
            System.out.println(">>>>>>>>>>>>>>>>>>>>>>>>>>");
            System.out.println("1.Show balance");
            System.out.println("2.Deposit");
            System.out.println("3.Withdraw");
            System.out.println("4.Exit");
            System.out.println(">>>>>>>>>>>>>>>>>>>>>>>>>>");

            System.out.print("Enter your choice(1-4): ");
            choice = scanner.nextInt();

            switch (choice) {
                case 1 -> showBalance(balance);
                case 2 -> balance = balance + makeDeposit();
                case 3 -> balance = balance - withdraw(balance);
                case 4 -> isRunning = false;
                default -> System.out.println("Invalid choice");
            }
        }

        System.out.println("----------------------------------------------------------");
        System.out.println("Thank you for using Nazaruk Banking! have a nice day!");
        System.out.println("----------------------------------------------------------");

        scanner.close();
    }

    static void showBalance(double balance) {
        System.out.println(">>>>>>>>>>>>>>>>>>>>>>>>>>");
        System.out.printf("Your current balance" + " £%.2f\n", balance);
    }

    static double makeDeposit() {
        double amount;

        System.out.print("Enter an amount for deposit: ");
        amount = scanner.nextDouble();

        if (amount < 0) {
            System.out.println("Invalid amount");
            return 0;
        } else {
            return amount;
        }
    }

    static double withdraw(double balance) {
        System.out.print("Enter an amount to withdraw: ");
        double amount = scanner.nextDouble();

        if (amount > balance) {
            System.out.println("You don't have enough money.");
            return 0;
        } else if (amount <= 0) {
            System.out.println("Amount must be positive.");
            return 0;
        } else {
            return amount;
        }

    }
}



