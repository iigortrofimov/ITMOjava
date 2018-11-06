package lesson4.homework.task3;

import java.util.Arrays;

public class Library {
    private Book[] books;
    public int counter = 0;
    public int size = 10;

    public Library(int size) {
        this.books = new Book[size];
    }

    public void putBook(Book book, int quantity){
        if(size==0){
            System.out.println("Места для книг нет");
            return;
        }
        for (int i = 0; i < quantity; i++) {
            if (books[i] == null) {
                books[i] = book;
                size--;
                if(size==0){
                    int lost = quantity-books.length;
                    System.out.println("Места для оставшихся " + lost + " книг нет");
                    return;
                }
            }else if (books[i] != null) {
                quantity++;
               // System.out.println(quantity);
            }
        }
    }
//   public void putBook (Book book, int quantity){
//        //while (size != 0) {
//            for (int i = 0; i < quantity; i++) {
//                books[i + counter] = book;
//                size--;
//                if (size == 0) {
//                    System.out.println("Места для книг нет");
//                    counter = counter + quantity;
//                    return;
//                    }
//            }
//            counter = counter + quantity;
//        }
   //}
//    public void getBook (Book book, int quantity){
//        while (size <= 10) {
//            for (int i = 0; i < quantity; i++) {
//                books[counter - i] = null;
//                size++;
//                if (size == 10) {
//                    System.out.println("Хранилище пустое");
//                    //return;
//                }
//            }
//            counter = counter - quantity;
//        }
//    }
public int getBook(Book book,int quantity){
    for (int i = 0; i < quantity; i++) {
        if(i>=books.length){
            int notFound = quantity - books.length;
            System.out.println ("В библиотеке не хватает " + notFound + " книг");
            break;
        }
        if(books[i] == book){
            books[i] = null;
            size++;
        }else if(books[i] != book){
            quantity++;
        }
    }
    return size;
}

    public void showBook(){
        System.out.println(Arrays.toString(books));
    }

    public void showCounterandSize(){
        System.out.println(size);
        System.out.println(counter);
    }


}
