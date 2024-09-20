package example.app;
import java.util.ArrayList;
import java.util.List;
public class Library {
    private List<Book> books = new ArrayList<>();

    // Додає книгу, якщо вона не null
    public void addBook(Book book) {
        if (book == null) {
            throw new IllegalArgumentException("Book cannot be null");
        }
        books.add(book);
    }

    // Видаляє книгу, якщо вона є в бібліотеці
    public boolean removeBook(Book book) {
        if (book == null) {
            throw new IllegalArgumentException("Book cannot be null");
        }
        return books.remove(book);
    }

    // Повертає список всіх книг
    public List<Book> getBooks() {
        return new ArrayList<>(books); // Захист від зміни внутрішнього списку
    }

    // Повертає кількість книг у бібліотеці
    public int getBookCount() {
        return books.size();
    }
}