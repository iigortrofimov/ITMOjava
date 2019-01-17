package multithreadingHW.library;

import java.util.Scanner;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;

public class Reader implements Runnable {

    private String name;
    private Library library;
    private Book book;
    private BlockingQueue<Book> homeBookList;
    private BlockingQueue<Book> libraryBookList;

    public Reader(String name, Library library) {
        this.name = name;
        this.library = library;
        homeBookList = new ArrayBlockingQueue<>(10);
        libraryBookList = new ArrayBlockingQueue<>(10);
    }

    public Book getBook() {
        return book;
    }

    public void setBook(Book book) {
        this.book = book;
    }

    @Override
    public void run() {
        System.out.println("Доброго времени суток ! Книги нашей Библиотеки: \n" + library.getBookMap());
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Выберете книгу и укажите ее название: ");
            String choice = scanner.nextLine();
            System.out.println("Желаете забрать книгу домой? (да или нет) ");
            String takeHome = scanner.nextLine();

            for (Book book : library.getBookMap().values()) {
                if (book.getName().equalsIgnoreCase(choice)) {
                    if (book.isTakeHomePermission() && takeHome.equalsIgnoreCase("да")) {
                        homeBookList.add(book);
                        library.takeBook(book);
                        System.out.println("---------------------");
                        System.out.println("Заберет домой: \n" + homeBookList);
                        System.out.println("---------------------");
                        System.out.println("Книги, оставшиеся в библиотеке: \n");
                        library.showBooks();
                        System.out.println("---------------------");
                    } else if (takeHome.equalsIgnoreCase("да") && !book.isTakeHomePermission()) {
                        System.out.println("Данная книга доступна только для чтения в читальных залах библиотеки! " +
                                "Пройдете в читальный зал? (да/нет)");
                        String readInside = scanner.nextLine();
                        if (readInside.equalsIgnoreCase("да")) {
                            libraryBookList.add(book);
                            library.takeBook(book);
                        } else {
                            System.out.println("Как хотите!");
                        }
                    }
                    System.out.println("---------------------");
                    System.out.println("Книги, находящиеся в читальном зале у посетителей: \n" + libraryBookList);
                    System.out.println("---------------------");
                    System.out.println("---------------------");
                    System.out.println("Книги, которые забрали домой: \n" + homeBookList);
                    System.out.println("---------------------");
                }
            }
            System.out.println("Вам нужны еще книги? (да/нет)");
            String additional = scanner.nextLine();
            if (additional.equalsIgnoreCase("нет")) {
                break;
            }
        }
        System.out.println("Желаете вернуть книгу(книги)? (да/нет)");
        while (true) {
            String returnAnswer = scanner.nextLine();
            if (returnAnswer.equalsIgnoreCase("да")) {
                System.out.println("Вот список книг, которые вы брали на дом: " + homeBookList);
                System.out.println("Cписок книг, которые вы брали для чтения в библиотеки: " + libraryBookList);
                System.out.println("Напишите название книги, которую хотите вернуть?");
                String returnBook = scanner.nextLine();
                System.out.println("Данную книгу вы забирали домой? (да/ нет)");
                String statusBook = scanner.nextLine();
                if (statusBook.equalsIgnoreCase("да")) {
                    for (Book book : homeBookList) {
                        if (returnBook.equalsIgnoreCase(book.getName())) {
                            homeBookList.remove(book);
                            library.addBook(book);
                        }
                    }
                } else if (statusBook.equalsIgnoreCase("нет")) {
                    for (Book book : libraryBookList) {
                        if (returnBook.equalsIgnoreCase(book.getName())) {
                            libraryBookList.remove(book);
                            library.addBook(book);
                        }
                    }
                }
                System.out.println("Остались ли у вас еще книги, которые вы бы хотели сдать в библиотеку? (да/нет)");
                String returnAnswer2 = scanner.nextLine();
                if (returnAnswer2.equalsIgnoreCase("нет")) {
                    break;
                } else {
                    System.out.println("Желаете вернуть книгу(книги)? (да/нет)");
                }
            }
        }
        library.showBooks();
    }
}