package lesson1.homework;

public class task6 {
    public static void main(String[] args) {
        double a = 13, b = 14, c = 3, degree = 2, d = (Math.pow(b, degree) - 4 * a * c), x1, x2;
        if (d >0)
        {
            x1 =(-b - Math.sqrt(d)) / (2 * a);
            x2 =(-b + Math.sqrt(d)) / (2 * a);
            System.out.println(x1 + x2);
        }
        if (d == 0)
        {
            x1 = x2 = -(2 /(2 * a));
            System.out.println(x1);
        }
        if (d < 0)
        {
            System.out.println("Уравнение не имеет действительных корней");
        }

    }
}
