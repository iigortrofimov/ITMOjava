package lesson4.homework.task1;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
       Rectangle rectangle = new Rectangle();
       rectangle.a = new double[]{2,3};
       rectangle.b = new double[]{4,5};
       rectangle.c = new double[]{1,7};
       rectangle.d = new double[]{6,8};
       System.out.println(rectangle.getS());

       Triangle triangle = new Triangle();
       triangle.setA(new double[]{5,4});
       triangle.setB(new double[]{2,6});
       triangle.setC(new double[]{1,8});
       System.out.println(triangle.getS());
        System.out.println(triangle.toString());





    }
}
