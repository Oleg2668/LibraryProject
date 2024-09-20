package example.app;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        Library library = new Library();

        Book book1 = new Book("1984", "George Orwell");
        Book book2 = new Book("The Catcher in the Rye", "J.D. Salinger");

        library.addBook(book1);
        library.addBook(book2);

        System.out.println(" ");
        List<Book> books = library.getBooks();
        System.out.println("Books in the library: " + books);


        System.out.println("Кількість книг: " + library.getBookCount());
        System.out.println("");
        System.out.println("Book 1: "+ book1.toString());
        System.out.println("Book 2: "+ book2.toString());
    }
}