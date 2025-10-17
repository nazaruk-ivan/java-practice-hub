import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class quiz {
    public static void main(String[] args) {
        // quiz game

        //steps include: questions array, options to answer
        //variables
        //welcome message
        // questions(randomly)
        // list options, get answer from user, check guess
        //display final grade achived by user

        String[] questions = {
                "A. What river flows through the city of London?",
                "B. What is the name of the famous clock tower at the Palace of Westminster?",
                "C. Which London landmark has a large observation wheel offering views of the city?",
                "D. What is the name of the London Underground system commonly known as?",
                "F. In what year was City, University of London founded?"
        };

        String[][] options = {
                {"1. Thames", "2. Severn", "3. Mersey", "4. Clyde"},
                {"1. Big Ben", "2. London Eye", "3. Tower Bridge", "4. The Shard"},
                {"1. The Gherkin", "2. London Eye", "3. St Paul’s Cathedral", "4. The O2"},
                {"1. The Metro", "2. The Subway", "3. The Tube", "4. The Line"},
                {"1. 1820", "2. 1894", "3. 1920", "4. 1965"}
        };

        int[] answers = {1, 1, 2, 3, 2};
        int score = 0;
        int guess = 0;

        Scanner scanner = new Scanner(System.in);

        System.out.println(">>>>>>>>>>>>>>>>>>>>>>>>>>>>>>");
        System.out.println("Welcome to London Quiz Game !");
        System.out.println(">>>>>>>>>>>>>>>>>>>>>>>>>>>>>>");

        for (int i = 0; i < questions.length; i++) {
            System.out.println(questions[i]);

            for (String option : options[i]) {
                System.out.println(option);
            }

            System.out.println("Enter your guess: ");
            guess = scanner.nextInt();
            if(guess == answers[i]) {
                System.out.println(">>>>>>>>>>>>>>>>>>>>>>>>>>>>>>");
                System.out.println("Congratulations! You guessed the correct answer.");
                System.out.println(">>>>>>>>>>>>>>>>>>>>>>>>>>>>>>");
                score += 1;
            } else {
                System.out.println(">>>>>>>>>>>>>>>>>>>>>>>>>>>>>>");
                System.out.println("Wrong guess");
                System.out.println(">>>>>>>>>>>>>>>>>>>>>>>>>>>>>>");
            }
        }
        System.out.println("Congratulations you finished the game! Your final score is: " +score);



        scanner.close();
    }
}


