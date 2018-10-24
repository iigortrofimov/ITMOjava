package lesson3;

import java.util.Random;
import java.util.Scanner;

public class task4 {
    public static void main(String[] args) {
        System.out.println("Введите положительное четкое число");
        Scanner in = new Scanner(System.in);
        int num = in.nextInt();
        Random rand = new Random();
        if (num > 0 && num % 2 ==0){
            int[] arr = new int[num];
            for (int i = 0; i < arr.length; i++){
                int n = rand.nextInt(10);
                arr[i] = n;
            }
        }

    }
}
