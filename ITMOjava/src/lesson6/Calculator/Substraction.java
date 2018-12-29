package lesson6.Calculator;

public class Substraction extends Operations {
    public Substraction(int var1, int var2) {
        super(var1, var2);
    }

    @Override
    public void execute() {
        System.out.println(getVar1() - getVar2());
    }
}
