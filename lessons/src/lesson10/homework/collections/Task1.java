package lesson10.homework.collections;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class Task1 {
    /*Написать программу со следующим функционалом:
    Считывание максимум 5 строк с клавиатуры,
    занесение строк в список,
    поиск самой короткой строки,
    вывод самой короткой строки на экран по запросу пользователя (команда в консоле /short string)
    Если одинаково коротких строк несколько, выводить каждую с новой строки*/

    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        //Iterator<String> iterator = list.iterator();

        for (int i = 0; i < 5; i++) {
            list.add(scanner.nextLine());
        }

        int min = list.get(0).length();

        //System.out.println(list.size());  5
 /*       System.out.println(list.get(0).length());
        System.out.println(list.get(1).length());
        System.out.println(list.get(2).length());
        System.out.println(list.get(3).length());
        System.out.println(list.get(4).length());*/

        for (int a = 0; a < list.size(); a++) {
            if (list.get(a).length() < min) {
                min = list.get(a).length();
//            System.out.println(list.get(a));
//            System.out.println(min);
            }
        }

        for (String aList : list) {
            if (aList.length() == min) {
                System.out.println(aList);
            }
        }
    }
}

