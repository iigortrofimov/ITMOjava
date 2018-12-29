package lesson4.homework.task1;

public class Circle {
    private double[] a = new double[2];
    private double[] b = new double[2];

    public double[] getA() {
        return a;
    }
    public double[] getB() {
        return b;
    }
    public void setA(double[] a) {
        this.a = a;
    }
    public void setB(double[] b) {
        this.b = b;
    }

    public double getLength(){
        double ab =Math.sqrt((Math.pow((b[0] - a[0]), 2)) + (Math.pow((b[1] - a[1]), 2)));
        return 2 * ab * Math.PI;
    }


}
