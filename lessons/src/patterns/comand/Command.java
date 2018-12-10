package patterns.comand;

abstract public class Command {
    protected TextProcessor proccesor;

    abstract String name();

    abstract boolean execute();

    public Command(TextProcessor processor) {
        this.proccesor = processor;
    }
}
