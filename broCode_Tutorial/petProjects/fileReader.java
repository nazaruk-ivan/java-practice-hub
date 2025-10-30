import java.io.*;
import java.util.Scanner;
import java.io.FileReader;

public class Main {
    public static void main(String[] args) {
        //writing files
        String filePath = "/Users/ivan/Desktop/Study/uni_coding/practice/src/test.txt";


        try(BufferedReader reader = new BufferedReader(new FileReader(filePath))) {
            System.out.println("That file exists");
            String line;

            while ((line = reader.readLine()) != null){
                System.out.println(line);
            }
        }
        catch(FileNotFoundException e){
            System.out.println("Could not locate file");
        }

        catch (IOException e){
            System.out.println("Something went wrong");
        }
    }
}