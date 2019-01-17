package multithreadingHW.library;

/*Задача 1
Библиотека. Доступны для чтения несколько книг.
Одинаковых книг в библиотеке нет. Некоторые выдаются
на руки, некоторые только в читальный зал. Читатель
может брать на руки и в читальный зал несколько книг.
*/
public class Main {
    public static void main(String[] args) {
        Book book1 = new Book("Гарри Поттер", "Джоан Роулинг", 1, true);
        Book book2 = new Book("Властелин Колец", "Джон Толкин", 2, false);
        Book book3 = new Book("Финансист", "Теодор Драйзер", 3, true);
        Book book4 = new Book("Однажды в Америке", "Гарри Грей", 4, false);

        Library library = new Library();
        library.addBook(book1);
        library.addBook(book2);
        library.addBook(book3);
        library.addBook(book4);

        Reader reader = new Reader("Igor", library);
        new Thread(reader).start();
    }
}