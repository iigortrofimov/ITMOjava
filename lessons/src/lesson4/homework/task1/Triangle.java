package lesson4.homework.task1;

import java.util.Arrays;

public class Triangle {
    private double[] a = new double[2];
    private double[] b = new double[2];
    private double[] c = new double[2];

    public void setA(double[] a) {
        this.a = a;
    }

    public void setB(double[] b) {
        this.b = b;
    }

    public void setC(double[] c) {
        this.c = c;
    }

    public double[] getA() {
        return a;
    }

    public double[] getB() {
        return b;
    }

    public double[] getC() {
        return c;
    }

    public double getS(){
        return 0.5 * Math.abs((a[0] -c[0]) * (b[1] - c[1]) - (b[0] - c[0]) * (a[1] - c[1])); }

    @Override
    public String toString() {
        return "Triangle{" +
                "a=" + Arrays.toString(a) +
                ", b=" + Arrays.toString(b) +
                ", c=" + Arrays.toString(c) +
                '}';
    }
}
