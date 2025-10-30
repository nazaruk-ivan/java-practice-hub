import java.io.*;
import java.util.Scanner;
import java.io.FileReader;
import java.util.Arrays;

public class lab24_10 {
    public static void main(String[] args) {
        //Lab 24.10.2025

        //two integers #1 exercise
        Scanner scanner =  new Scanner(System.in);

        int num1 = 0;
        int num2 = 0;

        System.out.println("Please enter first number you want to compare: ");
        num1 = scanner.nextInt();

        System.out.println("Please enter second number you want to compare: ");
        num2 = scanner.nextInt();

        if(num1>num2){
            System.out.println(num1 + " is greated than " + num2);
        } else {
            System.out.println(num2 + " is greater than " + num1);
        }

        //positive number #2 exercise
        int n = 0;
        int sum = 0;
        System.out.println("Please enter positive number: ");
        n = scanner.nextInt();

        for (int x = 0; x < n; x++){
            sum += x;
        }

        System.out.println("The sum is: " + sum);

        //negative integer input
        int negative_ing = 0;

        System.out.println("Please enter an integer than smaller than 0: ");
        negative_ing = scanner.nextInt();

        while (negative_ing>0){
            System.out.println("Make sure to enter integer smaller than 0(negative int): ");
            negative_ing = scanner.nextInt();
        }

        System.out.println("Thank you! You entered correct number");

        //month choice
        int choice = 0;
        System.out.println("You choice is 1-January, 2-February, 3-March\n, 4-April, 5-May, 6-June\n, 7-July, 8-August, 9-September\n, 10-October, 11-November, 12-December");
        System.out.println("Please enter number from 1 -10 to choose your favorite month:");

        choice = scanner.nextInt();

        switch (choice) {
            case 1 -> System.out.println("You chose January");
            case 2 -> System.out.println("You chose February");
            case 3 -> System.out.println("You chose March");
            case 4 -> System.out.println("You chose April");
            case 5 -> System.out.println("You chose May");
            case 6 -> System.out.println("You chose June");
            case 7 -> System.out.println("You chose July");
            case 8 -> System.out.println("You chose August");
            case 9 -> System.out.println("You chose September");
            case 10 -> System.out.println("You chose October");
            case 11 -> System.out.println("You chose November");
            case 12 -> System.out.println("You chose December");
            default -> System.out.println("Invalid choice — please enter a number between 1 and 12!");
        }

        //6 it sorts the array of integer, and swap the numbers that are not in the correct order


        //ADVANCED EXERCISES
        //exercise 6

        int n1 = 0;
        int sum2 = 0;

        System.out.println("Please enter amount of numbers you want to calculate: ");
        n1 = scanner.nextInt();

        int[] numbers = new int[n1];


        for (int x=0; x < n1; x++){
            System.out.println("Please enter a number: ");
            numbers[x] = scanner.nextInt();
        }

        System.out.println(Arrays.toString(numbers));

        for (int x = 0; x < numbers.length; x++) {
            if (x % 2 == 0) {
                sum2 += numbers[x];
            } else {
                sum2 -= numbers[x];
            }
        }

        System.out.println("Result (a1 - a2 + a3 - a4 ...): " + sum2);


        //exercise 7(reverse order)

        int nNew = 0;
        int sum3 = 0;


        System.out.println("Please enter array of ints: ");
        nNew = scanner.nextInt();

        int[] numbers2 = new int[nNew];
        int[] result_number = new int[nNew];


        for (int x=0; x < nNew; x++){
            System.out.println("Please enter a number: ");
            numbers2[x] = scanner.nextInt();
        }

        System.out.println("Original order: " + Arrays.toString(numbers2));

        System.out.print("Reverse order: ");

        for (int x = numbers2.length - 1; x >= 0; x--) {
            System.out.print(numbers2[x] + " ");
        }

        //exercise #8
        int triangle_floors = 0;

        System.out.println("Please enter an integer that will represent floors of triangle of *: ");
        triangle_floors =  scanner.nextInt();

        for (int i = 1; i <= triangle_floors; i++) {
            for (int j = 1; j <= (2 * i - 1); j++) {
                System.out.print("*");
            }
            System.out.println();
        }

        //exercise #9

        int num9 = 0;
        System.out.println("Please enter any random number: ");
        num9 = scanner.nextInt();

        while (num9 != 1) {
            if (num9 % 2 == 0) {
                num9 = num9 / 2;
            } else {
                num9 = num9 * 3 + 1;
            }

            System.out.println(num9);
        }

        System.out.println("result number is: " + num9);

    }
}

