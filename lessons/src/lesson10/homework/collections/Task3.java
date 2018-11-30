package lesson10.homework.collections;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Task3 {
    /*Написать программу со следующим функционалом:
    Считывание  с клавиатуры 10 слов в список строк.
    Метод doubleValues должен удваивать слова по принципу a,b,c -> a,a,b,b,c,c.
    Метод printList()  должен выводить результат на экран (каждое значение с новой строки).*/
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < 7; i++) {
            list.add(scanner.nextLine());
        }
        ArrayList<String> list2 = doubleValues(list);
        System.out.println(list2);

        for (String string : list2) {
            System.out.println(string);
        }

    }

    public static ArrayList<String> doubleValues(ArrayList<String> list) {
        ArrayList<String> list1 = new ArrayList<>();
        String s;
        for (int i = 0; i < list.size(); i++) {
            s = list.get(i);
            list1.add(s);
            list1.add(s);

        }
        return list1;
        //   }
//        ArrayList<String> list1 = new ArrayList<>();
//        for (int i = 0; i < list.size(); i++) {
//            list1.add(list.get(i) + list.get(i));
//
//        }
//        return list1;
    }
}

