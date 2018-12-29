package lesson4.homework.task1;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
       Rectangle rectangle = new Rectangle();
       rectangle.a = new double[]{2,3};
       rectangle.b = new double[]{4,5};
       rectangle.c = new double[]{1,7};
       rectangle.d = new double[]{6,8};
       System.out.println("S = " + rectangle.getS());
        System.out.println("P = " + rectangle.getP());
        System.out.println("---------------------------");

       Triangle triangle = new Triangle();
       triangle.setA(new double[]{5,4});
       triangle.setB(new double[]{2,6});
       triangle.setC(new double[]{1,8});
       System.out.println("S = " + triangle.getS());
        System.out.println("P = " + triangle.getP());
        System.out.println("--------------------------");

        Circle circle = new Circle();
        circle.setA(new double[]{2, 3});
        circle.setB(new double[]{4, 6});
        System.out.println("Length = " + circle.getLength());
        System.out.println("-------------------------------------");





    }
}
