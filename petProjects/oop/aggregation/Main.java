import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Aggregation =  Represents a "has-a" relationship between objects

        Book book1 = new Book("Pride and Prejudice", 255);
        Book book2 = new Book("The Great Gatsby", 150);
        Book book3 = new Book("To Kill a Mockingbird", 450);

        Book[] books = {book1, book2, book3};

        Library library = new Library("City St Georges library", 1894, books);
        library.displayInfo();
    }
}