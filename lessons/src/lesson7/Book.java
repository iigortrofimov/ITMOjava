package lesson7;

import java.util.Objects;
import java.util.Random;

public class Book {
    private String title;
    private String author;
    private int pages;

    public static int soldBook; //  можем сделать методы, классыб переменые | относятся к классу, а не к объекту||
    // обратиться можно по имен класса

    static {
        soldBook = - (new Random().nextInt(100)); // рандомное значение с "-"
    }

    public void sellBook(){
        soldBook++;
    }

    public static String getStatics(){
        return "Book sold: " + soldBook;
    }

    public Book(String title, String author) {
        this.title = title;
        this.author = author;

    }


    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public int getPages() {
        return pages;
    }

    public void setPages(int pages) {
        this.pages = pages;
    }

    // все классы наследуются от класса Object
    // toString()


    @Override
    public String toString() {
        return "Book{" +
                "title='" + title + '\'' +
                ", author='" + author + '\'' +
                ", pages=" + pages +
                '}';
    }

    // clone() - возращает копию объекта

    // getClass() - возравщает ссылку на класс объекта

    //finalize()
    // wait() | notify() | notifyAll() - для многопоточности

    // equals() - для сравнения объектов true или false, по умолчанию сравивае объекты с помощью ==
    // hashCode() - возращает hashCode объекта


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Book book = (Book) o; // приведение типа
        return pages == book.pages &&
                Objects.equals(title, book.title) &&
                Objects.equals(author, book.author);
    }

    @Override
    public int hashCode() {
        return Objects.hash(title, author, pages);
    }
}
