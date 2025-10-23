import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //writing files

        String filePath = "/Users/ivan/Desktop/Study/uni_coding/practice/src";
        String textContent = "I like sushi!\n It's really good.";


        try ( FileWriter writer = new FileWriter("test.txt")){
            writer.write(textContent);
            System.out.println("File has been written");
        }
        catch (FileNotFoundException e){
            System.out.println("Could not locate file location");
        }
        catch (IOException e){
            System.out.println("Could not write file");
        }

    }
}