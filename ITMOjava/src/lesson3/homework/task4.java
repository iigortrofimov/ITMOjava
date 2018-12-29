package lesson3.homework;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class task4 {
    public static void main(String[] args) {
        int sumModLeft = 0;
        int sumModRight = 0;
        int num;
        System.out.println("Введите положительное четное число");
        Scanner in = new Scanner(System.in);
        if (in.hasNextInt()) {
            do {num = in.nextInt();
                if (num % 2 != 0 || num < 1) {
                    System.out.println("Введите правильное число");
                }
            } while (num % 2 != 0 || num < 1);

                int[] arr = new int[num];
                for (int i = 0; i < arr.length; i++) {
                    arr[i] = (int) (Math.random() * (10 + 1) - 5); // //( Math.random() * (b-a + 1) ) + a
                    System.out.println(arr[i] + " ");
                    if (i < arr.length / 2 ) {
                        sumModLeft = Math.abs(arr[i]) + sumModLeft;
                    } else
                        sumModRight = Math.abs(arr[i]) + sumModRight;
                }
                if (sumModLeft > sumModRight) {
                    System.out.println("Сумма модулей левой половины массива больше = "+ sumModLeft);
                } else if (sumModLeft == sumModRight) {
                    System.out.println("модули равны");
                } else System.out.println("Сумма модулей правой половины массива больше = " + sumModRight);
            }else System.out.println("Введено не число");
    }
}

