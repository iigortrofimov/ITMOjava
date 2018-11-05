package lesson6.homework.LinkedList2;

public class Main {
    public static void main(String[] args) {
        LinkedList list = new LinkedList();
        list.push(100);
        list.push(200);
        list.push(300);
        list.showList();
        System.out.println("------------------");
//        list.pop();
//        list.showList();
//        System.out.println("_______________");
//        list.pop();
//        list.showList();
//        System.out.println("----------------");
//        list.pop();
//        list.showList();
        list.shift(400);
        list.shift(500);
        list.showList();
        System.out.println("____________________");
        list.unshift();
        list.showList();

    }




}
