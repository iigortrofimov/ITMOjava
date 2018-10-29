package lesson3;

import java.util.Arrays;

public class project2_lesson3 {
    public static void main(String[] args) {
        String str = "String";
        String str2 = new String("String");


        String str4 = "String String";
        String str5 = "String";
        String str3 = String.format("String %02d", 2); // String 02 используется очень редко
        System.out.println(str3);

        System.out.println("String String");
        System.out.println();

        System.out.println(str == str2); // false
        System.out.println(str == str5); // true

        System.out.println(str.equals(str2));// true
        System.out.println(str.equals(str5));//true

        String str6 = "String string";

        System.out.println(str.equalsIgnoreCase(str6)); /// почитать
        System.out.println(str.equals(str6));

        System.out.println(str.startsWith("Qwe"));
        System.out.println(str.endsWith("G"));


        String str10 = "string";
        String str11 = new String("string");
        String str12 = "str";
        String str13 = "String string";

        System.out.println(str10.compareTo(str11)); // 0 - если строки равны
        System.out.println(str11.compareTo(str12));// положительный если строка больше (раньше посимвольно)прописная буква идет раньше загловной
        System.out.println(str11.compareTo(str13));// отрицательный если строка меньше

        System.out.println("string".compareTo("String string"));
        System.out.println("string".compareToIgnoreCase("String string"));// регистр проигнорирован

//        int compareRes = str11.compareTo(str12);
//        if (str11.compareTo(str12) == 0)
//        {
//
//        }

        String a = "Astring";
        String b = "Bstring";
        String c = "Cstring";

        String[] strArr = {c, a, b};
        Arrays.sort(strArr); // почитать
        System.out.println(Arrays.toString(strArr));

        System.out.println(c.substring(3,5)); //
        System.out.println(a.contains("str"));

        String string = "First";
        String string2 = "Second";
        string2 += string;
        System.out.println(string2);

        for (int i = 0; i < 10; i++)
        {
            string += string2;
        }
        System.out.println(string);

//        ========================================StringBuffer | StringBuilder==============редактируют имеющиеся строки

        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(string);
        for (int i = 0; i < 10; i++)
        {
            stringBuilder.append(" string").append("str");
        }
        System.out.println(stringBuilder.toString());


    }
}
