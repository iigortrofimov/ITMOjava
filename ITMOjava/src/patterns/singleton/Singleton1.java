package patterns.singleton;

public class Singleton1 {

    private static Singleton1 instance;

    // prohibition of creation objects outside the class
    private Singleton1() {
    }

    // creation object on demand
    public static Singleton1 getInstance() {
        if (instance == null) {
            instance = new Singleton1();
        }
        return instance;
    }
}
