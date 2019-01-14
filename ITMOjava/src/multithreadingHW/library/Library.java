package multithreadingHW.library;

import java.util.concurrent.ConcurrentHashMap;

public class Library {
    private ConcurrentHashMap<Book, String> bookMap;

    public Library() {
        bookMap = new ConcurrentHashMap<>();
    }

    public ConcurrentHashMap<Book, String> addBook(Book book) {
        return bookMap;
    }

    public ConcurrentHashMap<Book, String> remove(ConcurrentHashMap<Book, String> bookMap, Book book) {
        return bookMap;
    }

}
