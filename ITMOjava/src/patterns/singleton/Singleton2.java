package patterns.singleton;

public class Singleton2 {
    private static final Singleton2 INSTANCE = new Singleton2();

    private Singleton2() {
    }

    // creation objects at initialization of the class
    public static Singleton2 getInstance() {
        return INSTANCE;
    }
}
