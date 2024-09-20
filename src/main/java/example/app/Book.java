package example.app;

import java.util.Objects;
public class Book {
    private String title;
    private String author;

    // Конструктор для створення книги
    public Book(String title, String author) {
        this.title = title;
        this.author = author;
    }

    // Геттери для отримання значень полів
    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    // Сеттери для зміни значень полів
    public void setTitle(String title) {
        this.title = title;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    // Метод equals для порівняння книг за назвою та автором
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Book book = (Book) o;
        return title.equals(book.title) && author.equals(book.author);
    }

    // Метод hashCode, необхідний для роботи з колекціями
    @Override
    public int hashCode() {
        return Objects.hash(title, author);
    }

    // Метод toString для відображення інформації про книгу
    @Override
    public String toString() {
        return "Book" +"'" + title + '\'' + ", author '" + author + '\'' ;
    }
}