package lesson10.homework;

public class Dog {
    private String name = null;
    private int weight = 1;
    private int age = 2;
    private String address = null;
    private String colour =  "Black";

    public Dog(String name) {
        this.name = name;
    }

    public Dog(String name, int weight, int age) {
        this.name = name;
        this.weight = weight;
        this.age = age;
    }

    public Dog(String name, int age) {
        this.name = name;
        this.age = age;
        this.weight = weight;
    }

    public Dog(int weight, String colour) {
        this.weight = weight;
        this.colour = colour;
    }

    public Dog(int weight, String address, String colour) {
        this.weight = weight;
        this.address = address;
        this.colour = colour;
    }

    @Override
    public String toString() {
        return "Dog{" +
                "name='" + name + '\'' +
                ", weight=" + weight +
                ", age=" + age +
                ", address='" + address + '\'' +
                ", colour='" + colour + '\'' +
                '}';
    }
}
