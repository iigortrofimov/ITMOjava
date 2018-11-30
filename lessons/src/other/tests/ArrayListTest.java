package other.tests;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ArrayListTest {
    /*Написать программу со следующим функционалом:
    Считывание  с клавиатуры 10 слов в список строк.
    Метод doubleValues должен удваивать слова по принципу a,b,c -> a,a,b,b,c,c.
    Метод printList()  должен выводить результат на экран (каждое значение с новой строки).*/
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < 5; i++) {
            list.add(scanner.nextLine());
        }

        ArrayList<String> list2 = doubleValues(list);
        for (String string : list2) {
            System.out.println(string);
        }

    }


    public static ArrayList<String> doubleValues(ArrayList<String> list) {
        String s;
        for (int i = 0; i < list.size(); i++) {
            s = list.get(i);
            list.add(s);
            list.add(s);

        }
        return list;
    }
}

