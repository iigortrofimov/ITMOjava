package lesson6.Calculator;

public class Main {
    public static void main(String[] args) {

        Operations multiplication = new Multiplication(13, 14);
        multiplication.execute(); //


        Operations substraction = new Substraction(13, 7);
        substraction.execute(); //

        Operations division = new Division(35, 0);
        division.execute();

        Operations addition = new Addition(142,8);
        addition.execute();
    }
}
