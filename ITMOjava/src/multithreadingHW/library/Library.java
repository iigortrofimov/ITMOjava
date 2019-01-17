package multithreadingHW.library;

import java.util.concurrent.ConcurrentHashMap;

public class Library {
    private ConcurrentHashMap<Integer, Book> bookMap;

    public Library() {
        bookMap = new ConcurrentHashMap<>();
    }

    public ConcurrentHashMap<Integer, Book> getBookMap() {
        return bookMap;
    }

    public ConcurrentHashMap<Integer, Book> addBook(Book book) {
        bookMap.putIfAbsent(book.getID(), book);
        return bookMap;
    }

    public ConcurrentHashMap<Integer, Book> takeBook(Book book) {
        bookMap.remove(book.getID(), book);
        return bookMap;
    }

    public void showBooks(){
        for (ConcurrentHashMap.Entry entry: bookMap.entrySet()){
            System.out.println(entry);
        }
    }
}
