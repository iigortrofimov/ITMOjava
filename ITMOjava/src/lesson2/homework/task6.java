package lesson2.homework;

public class task6 {
    public static void main(String[] args) {
        int x = 0;
        for (int i = 1001;  i <= 999999; i++)
        {
            int a = i/ 100000 % 10;
            int b = i/ 10000% 10;
            int c = i/ 1000% 10;
            int d = i/ 100% 10;
            int e = i/ 10% 10;
            int f = i% 10;
            if ((a+b+c)==(d+e+f)){
                x++;
            }



        }
        System.out.println(x);
    }
}
