package lesson1;

public class task7 {
    public static void main(String[] args) {
        int num = 787, num1 = num / 100, num2 = num / 10 % 10, num3 = num % 10;
        if (num3 >= num1 && num3 >= num2)
        {
            System.out.println(num3);
        }
        else if (num2 >= num1 && num2 >= num3)
        {
            System.out.println(num2);
        }
        else System.out.println(num1);
    }
}
