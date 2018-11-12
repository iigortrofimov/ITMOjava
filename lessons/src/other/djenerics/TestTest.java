package other.djenerics;

import java.util.Arrays;

public class TestTest {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7};
        int[] arr2 = Arrays.copyOf(arr, 4);
        int[] arr3 = new int[10];
        System.out.println(Arrays.toString(arr2));
        System.arraycopy(arr, 2, arr3, 1, 5);
        System.out.println(Arrays.toString(arr3));
        int[] arr4 = Arrays.copyOfRange(arr, 2, 7);
        System.out.println(Arrays.toString(arr4));


        for (int num: arr){
            System.out.println(num + 100);
        }
        int[] arr5 = {1,2,3,4,5,6,7};

        System.out.println(arr == arr5);
        System.out.println(arr.equals(arr5));
        System.out.println(Arrays.equals(arr,arr5));
        System.out.println("___________________________");
//        ________________________________________________

        String str1 = "Hello";
        String str2 = "hello";
        String str3 = "Hello";
        String str4 = "Hello world";
        String str5 = "Hel";

        System.out.println(str1 == str3);
        System.out.println(str1.equalsIgnoreCase(str2));
        System.out.println(str1.startsWith("he"));

        System.out.println(str1.compareTo(str2));
        System.out.println(str1.compareTo(str3));
        System.out.println(str1.compareTo(str4));
        System.out.println(str1.compareTo(str5));


        String a = "bstring";
        String b = "astring";
        String c = "cstring";

        String[] strArr = {a, b, c};
        Arrays.sort(strArr); // почитать
        System.out.println(Arrays.toString(strArr));

        System.out.println(a + b +c);
        System.out.println("------------------------------");

        Object d = "QWERTY";

        StringBuilder stringBuilder = new StringBuilder();
        System.out.println(stringBuilder.append(d));
        System.out.println(stringBuilder.reverse());



    }
}
