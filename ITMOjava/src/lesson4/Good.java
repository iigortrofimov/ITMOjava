package lesson4;

public class Good {
    private String title; // может установить только метод
    private int price;

    public Good(String title, int price) {
        this.title = title;
        this.price = price;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Good{" +
                "title='" + title + '\'' +
                ", price=" + price +
                '}';
    }

    public String getTitle() {
        return title;
    }

    public int getPrice() {
        return price;
    }
    // *методы - процедуры ничго не делают
}
