package lesson10.homework;

import java.util.Scanner;

public class Body {
    static double height;
    static double weight;

    public Body(double height, double weight) {
        this.height = height;
        this.weight = weight;
    }

    static public void indexGet() {
        double index = weight / (height * height);
        if (index < 18.5) {
            System.out.println("Недовес");
        }
        if (index >= 18.5 && index < 25) {
            System.out.println("Нормальный");
        }
        if (index > 25) {
            System.out.println("Избыточный вес");
        }
    }
}
