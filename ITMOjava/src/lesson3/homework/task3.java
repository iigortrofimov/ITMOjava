package lesson3.homework;

import java.util.Arrays;
import java.util.Random;

public class task3 {
    public static void main(String[] args) {
        int[] arr;
        arr = new int[15];
        Random rand = new Random();
        int chet = 0;
        for (int i = 0; i < arr.length; i++){
            int n = rand.nextInt(10);
            arr[i] = n;
            if (arr[i] % 2 == 0 && arr[i] != 0){
                chet++;
            }
        }
        System.out.println(Arrays.toString(arr));
        System.out.println(chet);

    }
}
