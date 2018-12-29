package lesson3;

import java.util.Arrays;

public class project_lesson3 {
    public static void main(String[] args) {
        // Arrays
        int[] arr; // объявление переменной массива/ обычно этим!
        int arr1 [];

        arr = new int[10]; // массив без значений по умолчанию на 10 элементов
        System.out.println(Arrays.toString(arr));
        System.out.println(arr.length);
        int a = 543;

        int [] arr3 = {2, 12, 45, 499, 23,a}; // наполнение массива при инициализации
        System.out.println(Arrays.toString(arr3));
        System.out.println(arr3.length);

        System.out.println(arr3[2]); // 45
        System.out.println(arr3[2+2]);

        arr3[1] = 123;
        System.out.println(Arrays.toString(arr3));

        // запомнить массив в цикле

        for (int i = 0; i < arr.length; i++)
        {
            arr[i] = i+10;
        }

        // ----------------------копирование массива---------------------------------------------
        int[] arr4 = {2, 6, 8, 3};
        int[] arr5 = arr4;
        System.out.println(Arrays.toString(arr4));

        int[] cloneArr4 = arr4.clone();

        int[] arr6 = new int[10];
//        System.arraycopy(srcArr,int srcPos,destArr, int destPos, int length)  какой именно массив, какую язейку и на какую длинну

        System.arraycopy(arr4, 1, arr6, 2, 3);
        System.out.println(Arrays.toString(arr6));


        int [] copyArr4 = Arrays.copyOf(arr4, 14);
        System.out.println(Arrays.toString(copyArr4));

        int[] copyRangeArr4 = Arrays.copyOfRange(arr4, 1,3);
        System.out.println(Arrays.toString(copyRangeArr4)); // [6. 8]

        // ---------------------------------перебор значений массива в цикле
        // for
        // int[] arr4 = {2, 6, 8, 3};

        arr4 = new int[] {2, 3, 7, 3, 6};
        for (int i = 0; i < arr4.length; i++)
        {
            arr4[i] += 100;
        }
        System.out.println(Arrays.toString(arr4));
        for (int num: arr4) // к элементам самого массива доступа нет, просто используем его значения
        {
            System.out.println("num = " + num);
        }


        // ----------------------------- сравнение массива
        arr4 = new int[]{2, 6, 8, 4, 3, 2};
        arr5 = new int[]{2, 6, 8, 4, 3, 2};

        System.out.println(arr4 == arr5); // false
        System.out.println(arr4.equals(arr5)); // false

        System.out.println(Arrays.equals(arr4, arr5)); // true

        int[] arr7 = new int[14];
        Arrays.fill(arr7, 233);
        System.out.println(Arrays.toString(arr7)); // все одним значением

        arr7 = new int[]{2, 62, 8, 41, 3, -2};
        Arrays.sort(arr7,1, 4);

        System.out.println(Arrays.toString(arr7));
        Arrays.sort(arr7);
        System.out.println(Arrays.toString(arr7));

        System.out.println(Arrays.binarySearch(arr7, 3)); // ищет ячейку по числу , если "-" такого значения нет




    }
}
