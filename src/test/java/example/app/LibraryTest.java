package example.app;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class  LibraryTest {

    @Test
    public void testAddBook() {
        Library library = new Library();
        Book book = new Book("Title", "Author");
        System.out.println("Додаємо книгу до бібліотеки.");
        library.addBook(book);
        assertEquals(1, library.getBookCount(), "Кількість книг не відповідає очікуваній.");
    }

    @Test
    public void testRemoveBook() {
        Library library = new Library();
        Book book = new Book("Title", "Author");
        System.out.println("Додаємо книгу для видалення.");
        library.addBook(book);
        System.out.println("Видаляємо книгу.");
        assertTrue(library.removeBook(book), "Книга не була видалена.");
        assertEquals(0, library.getBookCount(), "Кількість книг після видалення не відповідає очікуваній.");
    }

    @Test
    public void testAddNullBook() {
        Library library = new Library();
        //library.addBook(null);// перевірка роботи теста(IllegalArgumentException)
        System.out.println("Перевіряємо додавання null-книги.");
        assertThrows(IllegalArgumentException.class, () -> library.addBook(null), "Очікувалося виключення IllegalArgumentException");
    }

    @Test
    public void testRemoveNullBook() {
        Library library = new Library();
        System.out.println("Перевіряємо видалення null-книги.");

        // Перевіряємо, чи викликається IllegalArgumentException при видаленні null-книги
        assertThrows(IllegalArgumentException.class,
                () -> library.removeBook(null),
                "Очікувалося виключення IllegalArgumentException");
    }

}