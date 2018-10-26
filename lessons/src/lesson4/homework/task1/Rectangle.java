package lesson4.homework.task1;

public class Rectangle {
     public double[] a = new double[2];
     public double[] b = new double[2];
     public double[] c = new double[2];
     public double[] d = new double[2];



    public double getS(){
        double ab =Math.sqrt((Math.pow((b[0] - a[0]), 2)) + (Math.pow((b[1] - a[1]), 2)));
        double bc =Math.sqrt((Math.pow((c[0] - b[0]), 2)) + (Math.pow((c[1] - d[1]), 2)));

        return ab * bc;
    }



}
