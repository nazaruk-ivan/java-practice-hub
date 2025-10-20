import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

public class exceptions {
    public static void main(String[] args) {
        //Exceptions

        Scanner scanner = new Scanner(System.in);

        try{
            System.out.print("Enter a number: ");
            int number =  scanner.nextInt();
            System.out.println(number);
        }
        catch (InputMismatchException e){
            System.out.println("That wasn't a number!");
        }

        catch (ArithmeticException e){
            System.out.println("YOU CAN'T DIVIDE BY ZERO!");
        }

        catch (Exception e){
            System.out.println("Something went wrong");
        }
        //will run anyway
        finally {
            scanner.close();
        }
    }
}