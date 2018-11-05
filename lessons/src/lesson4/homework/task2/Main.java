package lesson4.homework.task2;

public class Main {
    public static void main(String[] args) {
        List list = new List();
        list.addNoda(4);
        list.addNoda(6);
        list.addNoda(7);
        list.addNoda(9);
        System.out.println("---------------------------");
        list.show();
        System.out.println("---------------------------");
        list.removeNoda(6);
        System.out.println("---------------------------");
        list.show();
    }
}
