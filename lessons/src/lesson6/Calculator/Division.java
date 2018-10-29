package lesson6.Calculator;

public class Division  extends Operations {
    public Division(int var1, int var2) {
        super(var1, var2);
    }

    @Override
    public void execute() {
        if ( getVar2() != 0) {
            System.out.println(getVar1() / getVar2());
        } else System.out.println("Ошибка");
    }
}
