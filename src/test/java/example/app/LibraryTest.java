package example.app;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class LibraryTest {

    @Test
    public void testAddBook() {
        Library library = new Library();
        Book book = new Book("Title", "Author");
        library.addBook(book);
        assertEquals(1, library.getBookCount());
    }

    @Test
    public void testRemoveBook() {
        Library library = new Library();
        Book book = new Book("Title", "Author");
        library.addBook(book);
        assertTrue(library.removeBook(book));
        assertEquals(0, library.getBookCount());
    }

    @Test
    public void testGetBooks() {
        Library library = new Library();
        Book book1 = new Book("Title1", "Author1");
        Book book2 = new Book("Title2", "Author2");
        library.addBook(book1);
        library.addBook(book2);
        assertEquals(2, library.getBooks().size());
    }

    @Test
    public void testAddNullBook() {
        Library library = new Library();
        assertThrows(IllegalArgumentException.class, () -> library.addBook(null));
    }

    @Test
    public void testRemoveNullBook() {
        Library library = new Library();
        assertThrows(IllegalArgumentException.class, () -> library.removeBook(null));
    }
}
