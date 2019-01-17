package multithreadingHW.library;

public class Book {
    private String name;
    private String author;
    private final int ID;
    private boolean takeHomePermission;

    public Book(String name, String author, int ID, boolean takeHomePermission) {
        this.name = name;
        this.author = author;
        this.takeHomePermission = takeHomePermission;
        this.ID = ID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public int getID() {
        return ID;
    }

    public boolean isTakeHomePermission() {
        return takeHomePermission;
    }

    public void setTakeHomePermission(boolean takeHomePermission) {
        this.takeHomePermission = takeHomePermission;
    }

    @Override
    public String toString() {
        return "Book{" +
                "name='" + name + '\'' +
                ", author='" + author + '\'' +
                '}';
    }
}

