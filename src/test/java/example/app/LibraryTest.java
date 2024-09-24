package example.app;

import org.junit.jupiter.api.*;
import static org.junit.jupiter.api.Assertions.*;
import java.util.List;

public class LibraryTest {

    private static Library library;


    @BeforeAll
    public static void setup() {
        library = new Library();
        System.out.println("Початкова ініціалізація бібліотеки");
    }

    @AfterEach
    public void cleanup() {
        library.getBooks().clear();
        System.out.println("Очищення бібліотеки після кожного тесту");
    }


    @Test
    @DisplayName("Перевірка додавання книги в бібліотеку")
    public void testAddBook() {
        Book book = new Book("Title", "Author");
        library.addBook(book);
        assertEquals(1, library.getBookCount());
    }

    @Test
    @DisplayName("Перевірка видалення книги з бібліотеки")
    public void testRemoveBook() {
        Book book = new Book("Title", "Author");
        library.addBook(book);
        assertTrue(library.removeBook(book));
        assertEquals(0, library.getBookCount());
    }

    @Test
    @DisplayName("Перевірка отримання всіх книг з бібліотеки")
    public void testGetBooks() {
        Book book1 = new Book("Title1", "Author1");
        Book book2 = new Book("Title2", "Author2");
        library.addBook(book1);
        library.addBook(book2);
        List<Book> books = library.getBooks();
        assertEquals(2, books.size());
    }

    @Test
    @DisplayName("Перевірка додавання null-книги")
    public void testAddNullBook() {
        assertThrows(IllegalArgumentException.class, () -> library.addBook(null), "Очікувалося виключення IllegalArgumentException");
    }

    @Test
    @DisplayName("Перевірка видалення null-книги")
    public void testRemoveNullBook() {
        assertThrows(IllegalArgumentException.class, () -> library.removeBook(null), "Очікувалося виключення IllegalArgumentException");
    }
}
