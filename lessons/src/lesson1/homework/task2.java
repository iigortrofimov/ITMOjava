package lesson1.homework;

public class task2 {
    public static void main(String[] args) {
        int totalArea = 10 * 100, bedArea = 15 * 25, freeLand = totalArea % bedArea;
        System.out.println("Незанятая часть участка = " + freeLand + " м2");
    }
}
