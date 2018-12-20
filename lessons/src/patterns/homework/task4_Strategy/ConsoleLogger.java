package patterns.homework.task4_Strategy;

public class ConsoleLogger implements ILogger {
    @Override
    public void write(String info) {
        System.out.println("*** " + info + " ***");
    }
}
