package lesson3.homework;

import java.util.Arrays;

public class task_string2 {
    public static void main(String[] args) {
        String str = "String string";
        System.out.println(str.substring(3));
        System.out.println(str.substring(2, 4));

        System.out.println(Arrays.toString(str.split(" ")));
        System.out.println(str.replaceAll("str", "olo"));
        System.out.println(str.replace("str", "olo"));
        System.out.println(str.join("-", "ing", "ing", "anf"));
    }
}
