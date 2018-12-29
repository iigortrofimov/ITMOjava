package lesson3.homework;

import java.util.Arrays;

public class task1 {
    public static void main(String[] args) {
        int[] arr;
        int num = 0;
        for (int i = 0; i < 20; i++) {
            if (i % 2 == 0) {
                num++;
            }
        }
        arr = new int[num];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = (i + 1 )* 2;
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i] + " ");
            System.out.println();
        }
    }
}
