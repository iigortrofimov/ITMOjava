package lesson10.homework.collections;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Task2 {
    /*Задача 2
    Написать программу со следующим функционалом:
    Считывание 20 чисел с клавиатуры,
    сохранение их в список,
    сортировка по трём другим спискам:
    число нацело делится на 3,
    нацело делится на 2 и
    все остальные.
    Числа, которые делятся на 3 и на 2 одновременно, например 6, попадают в оба списка.*/
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> list = new ArrayList<>();
        ArrayList<Integer> list2 = new ArrayList<>();
        ArrayList<Integer> list3 = new ArrayList<>();
        ArrayList<Integer> list4 = new ArrayList<>();
        for (int i = 0; i < 9; i++) {
            Integer x = scanner.nextInt();
            list.add(x);
            if (x % 3 == 0) {
                list2.add(x);
            }
            if (x % 2 == 0) {
                list3.add(x);
            }
            if (x % 2 != 0 && x % 3 != 0) {
                list4.add(x);
            }
        }
        for (Integer a : list) {
            System.out.print(a);
        }
        System.out.println();
        System.out.println("--------------------");
        for (Integer a : list2) {
            System.out.print(a);
        }
        System.out.println();
        System.out.println("--------------------");
        for (Integer a : list3) {
            System.out.print(a);
        }
        System.out.println("--------------------");
        for (Integer a : list4) {
            System.out.print(a);
        }
       // printList();


        // System.out.println(list + " " + list2 + " " + list3 + " " + list4);
    }
    public static void printList(List <Integer> list){
        for (int i = 0; i < list.size(); i++){
            System.out.print(list.get(i) + " ");
        }
    }

}
