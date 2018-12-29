package lesson2.homework;

public class task7 {
    public static void main(String[] args) {
        int x = 0;
        for (int h = 0; h < 23; h++){
            for (int min = 0; min <59; min++){
                if (h/10%10 == min%10 && h%10 == min/10%10)
                    x++;
            }
        } System.out.println(x);

    }
}
