package lesson9.storage;
import lesson9.classes.Book;
import lesson9.classes.Car;
import lesson9.storage.Storage;

public class Main {

    public static void main(String[] args) {
        Book tails = new Book("Сказки", 500);
        Book flowers = new Book("Цветы", 600);

        Car car = new Car("green", 1000);

        Storage<Book> bookStorage = new Storage();
        bookStorage.add(tails);
        bookStorage.add(flowers);
       // bookStorage.add(car);

        // ClassCastException возникает на моменте исполнения
        Book bookFromStorage = (Book) bookStorage.get(2);
        System.out.println(bookFromStorage);

    }
    // extends уточнения // возможно только получить значение
    public static Book getFirstBook(Storage<? extends Book> storage){// для раюлты с дочерними классами

        return storage.get(0);
    }

    public static void addToStorage(Storage<? super Book> storage){
        Book book = new Book("book", 111);
        storage.add(book);

        Object b = storage.get(0); // можно только через Object, но не сохраняться свойстава( в т.ч. методы того класса)
    }
}
