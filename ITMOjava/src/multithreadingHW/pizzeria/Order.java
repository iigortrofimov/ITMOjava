package multithreadingHW.pizzeria;

public class Order {
    private String dishName;

    public Order(String dishName) {
        this.dishName = dishName;
    }

    public String getDishName() {
        return dishName;
    }

    public void setDishName(String dishName) {
        this.dishName = dishName;
    }

    @Override
    public String toString() {
        return "Order{" +
                "dishName='" + dishName + '\'' +
                '}';
    }
}
