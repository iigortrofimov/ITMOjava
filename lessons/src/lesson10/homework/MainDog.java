package lesson10.homework;

public class MainDog {
    public static void main(String[] args) {
        Dog bob = new Dog("Bill", 6, 4);
        Dog hz = new Dog(12, "White");
        Dog hz1 = new Dog(12, "Pushkin", "Grey");

        System.out.println(bob.toString() + " " + hz.toString() + " " + hz1.toString());
    }
}
