package other.linkedList;

import lesson4.homework.task2.List;

public class Main {
    public static void main(String[] args) {
        LinkedList list = new LinkedList();
        list.addNode(100, 1);
        list.addNode(200, 2);
        list.addNode(300, 3);
        list.addNode(400, 4);
        list.showList();
        list.showIndex();
        System.out.println("---------------");
        list.showDataForIndex(4);
        System.out.println("-----------------");
        list.deletNode(4);
        list.showList();
        list.showIndex();



    }
}
