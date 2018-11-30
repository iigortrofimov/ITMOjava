package lesson10.homework;

import java.util.Scanner;

public class IndexMass {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите Ваш рост в м");
        double weght = scanner.nextDouble();
        System.out.println("Введите Ваш вес в кг");
        double height = scanner.nextDouble();
        Body body = new Body(weght, height);
        body.indexGet();


    }



}
