package lesson4.homework.task3;

import java.util.Arrays;

public class Library {
    private int maxQuantity = 15;
    private Book[] books = new Book[maxQuantity];
    int counter= 0;


   public void putBook (Book book, int quantity) {
            for (int x = 0; x < books.length - counter; x++) {
                books[x] = book;}
                if (books.length - counter < quantity) {
                    System.out.println("Места нет");
                    return;
                }counter = counter + quantity;
            }


    public void showBook (){
        System.out.println(Arrays.toString(books));
    }


}
