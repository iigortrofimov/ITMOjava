package lesson1.homework;

public class task5 {
    public static void main(String[] args) {
        double sum = 200_000, percent = 11, timing = 5, percentofSum, overPayment;
        percentofSum = sum * (percent * 0.01);
        overPayment =  percentofSum * timing;
        System.out.println("Переплата составит " + overPayment + " RUB");

    }
}
