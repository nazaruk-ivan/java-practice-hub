import java.util.*;

public class 11Tasks_MethodsAndRecursion {
    //Methods and recursion practice
    public static void main(String[] args) {
        printHello();
        sumNumbers();
        largeNum(3, 6);
        isEven(5);
        squareNumber(3);
        double[] numbers = {10.0, 20.0, 30.0, 40.0};
        averageOfNumbers(numbers);
        addNums(5, 10);
        addNums(2.5, 3.5);
        greetUser();
        sumTon(10);
        countDown(5);
        power(2, 3);
    }

    //Task #1
    public static void printHello(){
        for (int x = 0; x<=5; x++){
            System.out.println("Hello World");
        }
    }

    //Task 2
    public static void sumNumbers(){
        int n1 = 0;
        int n2 = 0;
        Scanner scanner = new Scanner(System.in);

        System.out.println("Please enter number 1: ");
        n1 = scanner.nextInt();

        System.out.println("Please enter number 2");
        n2 = scanner.nextInt();

        int sum =  n1 + n2;

        System.out.println("The sum of " + n1 + " and " + n2 + " is: " + sum);
    }

    //Task 3
    public static void largeNum(int x, int y) {
        System.out.println(Math.max(x, y));
    }

    //Task 4
    public static void isEven(int x){
        if (x % 2 == 0){
            System.out.println("It's even");
        } else {
            System.out.println("It's odd");
        }
    }

    //Task 5
    public static void squareNumber(int n){
        int square = n * n;
        System.out.println("The squre number of " + n + " is: " + square);
    }

    //Task 6
    public static void averageOfNumbers(double[] arr) {
        double sum = 0;

        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }

        double average = sum / arr.length;

        System.out.println("Average = " + average);
    }

    //Task 7
    public static void addNums(int x, int y){
        System.out.println(x + y);
    }
    public static void addNums(double x, double y){
        System.out.println(x + y);
    }

    //Task 8
    public static void greetUser(){
        Scanner scanner =  new Scanner(System.in);

        String name = "";

        System.out.println("Hello dear user, please enter your name: ");
        name = scanner.nextLine();

        System.out.printf("Hello %s!%n", name);

        scanner.close();
    }

    //Task 9
    public static void sumTon(int n){
        int sum = 0;
        for (int x = 0; x < n; x++){
            sum += x;
        }
        System.out.println(sum);
    }

    //Task 10
    public static void countDown(int n){
        for (int x = n; x <= 0; x--){
            System.out.println(x);
        }
    }

    //Task 11
    public static void power(int base, int exp){
        for (int x = 0; x < exp; x++){
            base *= base;
        }
        System.out.println(base);
    }
}