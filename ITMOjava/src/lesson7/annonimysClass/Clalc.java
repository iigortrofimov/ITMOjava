package lesson7.annonimysClass;

public class Clalc {
    int a;
    int b;

    public Clalc(int a, int b) {
        this.a = a;
        this.b = b;
    }

    public double summ(Operations operations){
        return operations.apply(a, b);

    }public double minus (Operations operations){
        return operations.apply(a, b);
    }
}
