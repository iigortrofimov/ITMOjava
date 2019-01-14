package multithreadingHW.library;

public class Reader implements Runnable {

    private String name;
    private Library library;

    public Reader(String name, Library library) {
        this.name = name;
        this.library = library;
    }

    @Override
    public void run() {

    }
}
