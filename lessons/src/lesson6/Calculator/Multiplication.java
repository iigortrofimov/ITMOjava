package lesson6.Calculator;

public class Multiplication extends Operations {
    public Multiplication(int var1, int var2) {
        super(var1, var2);
    }

    @Override
    public void execute() {
        System.out.println(getVar1() + getVar2());
    }
}


// public void add (Object object)
// public void remove (int index)
// public void get (int index)
// size()

// pop() push (Obj obj) работают с концом списка
// unshif shift с начала списка