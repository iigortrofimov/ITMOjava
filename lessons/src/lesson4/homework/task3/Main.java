package lesson4.homework.task3;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        //Library lib1 = new Library(10);
        Book book1 = new Book();
        book1.setName("Aladin");
        Book book2 = new Book();
        book2.setName("Olol");
        Book book3 = new Book();
        book3.setName("Trololo");

        Library library = new Library(10);
        library.putBook(book1, 2);
        library.putBook(book2, 6);
        library.putBook(book3,4);

        System.out.println("------------");
        library.showBook();

        System.out.println("------------");
        library.showCounterandSize();
        System.out.println("-------------");

       library.getBook(book1, 2);
       library.showBook();
        library.getBook(book2, 4);
        library.showBook();




    }
}
