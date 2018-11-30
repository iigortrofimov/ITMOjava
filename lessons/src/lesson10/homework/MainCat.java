package lesson10.homework;

public class MainCat {
    public static void main(String[] args) {
        Cat bob = new Cat("Bob", 3, 8, 4);
        Cat lob = new Cat("Lob", 2, 6, 3);
        System.out.println(bob.fight(lob));
        System.out.println(lob.fight(bob));



    }
}
