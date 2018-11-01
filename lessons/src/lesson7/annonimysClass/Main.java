package lesson7.annonimysClass;

public class Main {
    public static void main(String[] args) {
        Clalc clalc = new Clalc(3, 1);
        clalc.summ(new Operations() {
            @Override
            public double apply(double var1, double var2) {
                return var1 + var2;
            }
        });
        clalc.minus(new Operations() {
            @Override
            public double apply(double var1, double var2) {
                return var1 - var2;
            }
        });
    }
}
