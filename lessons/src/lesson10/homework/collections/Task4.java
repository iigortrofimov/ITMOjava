package lesson10.homework.collections;

import java.util.ArrayList;
import java.util.Scanner;

public class Task4 {

    /* Задача 4
     Ввести с клавиатуры 5 слов в список строк.
     Удалить 3 - ий элемент списка, и вывести оставшиеся элементы в обратном порядк*/
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < 5; i++) {
            list.add(scanner.nextLine());
        }
        list.remove(2);
        for (int i = list.size() - 1; i >= 0; i-- )
            System.out.println(list.get(i));
    }
}
