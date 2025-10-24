import javax.sound.sampled.*;
import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // music player
        String filePath = "/Users/ivan/Desktop/test_music.wav";
        File file = new File(filePath);

        try (AudioInputStream audioStream = AudioSystem.getAudioInputStream(file);
             Scanner scanner = new Scanner(System.in)) {

            Clip clip = AudioSystem.getClip();
            clip.open(audioStream);

            System.out.println("no problems detected");

            String response = "";

            while (!response.equals("Q")) {
                System.out.println("---------------");
                System.out.println("P = play");
                System.out.println("S = stop");
                System.out.println("R = reset");
                System.out.println("Q = quit");
                System.out.print("Please enter your choice: ");

                response = scanner.next().toUpperCase();

                switch (response) {
                    case "P" -> clip.start();
                    case "S" -> clip.stop();
                    case "R" -> {
                        clip.setMicrosecondPosition(0);
                        clip.start();
                    }
                    case "Q" -> clip.close();
                    default -> System.out.println("Invalid input, please try again.");
                }
            }

        } catch (UnsupportedAudioFileException e) {
            System.out.println("Unsupported Audio File");
        } catch (LineUnavailableException e) {
            System.out.println("Unable to access audio");
        } catch (IOException e) {
            System.out.println("Something went wrong");
        } finally {
            System.out.println("bye bye ");
        }
    }
}