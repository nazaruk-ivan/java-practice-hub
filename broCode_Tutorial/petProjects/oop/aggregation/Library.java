public class Library {

    String name;
    int yearEstablished;
    Book[] books;

    Library(String name, int yearEstablished, Book[] books){
        this.name = name;
        this.yearEstablished = yearEstablished;
        this.books = books;
    }

    void displayInfo(){
        System.out.println("The " + this.yearEstablished + " " + this.name +"\n");
        System.out.println("Books available: ");
        for (int x = 0; x< books.length; x++){
            System.out.println(books[x].displayInfo());
        }

    }
}
