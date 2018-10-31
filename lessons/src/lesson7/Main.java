package lesson7;

public class Main {
    public static void main(String[] args) {
        Book book1 = new Book("Война и Мир", "Толстой");
        book1.setPages(1000);

        Book book2 = new Book("Война и Мир", "Толстой");
        book2.setPages(1000);

        System.out.println(book1.toString());
        System.out.println(book2.toString());

        System.out.println(book1 == book2);
        System.out.println(book1.equals(book2)); //  послепереопределения будет true

        System.out.println(Book.getStatics());

        book1.sellBook();
        book1.sellBook();
        System.out.println(Book.getStatics());

        book2.sellBook();
        System.out.println(Book.getStatics());

        // переменные static общая для всех эеземпляров класса
    }
}
