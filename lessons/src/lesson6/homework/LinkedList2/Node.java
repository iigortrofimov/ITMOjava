package lesson6.homework.LinkedList2;

public class Node {
    int data, index;
    Node next;
    Node prev;

    public Node(int data) {
        this.data = data;
    }

    public Node(int data, int index) {
        this.data = data;
        this.index = index;
    }

    public Node(int data, Node next, Node prev) {
        this.data = data;
        this.next = next;
        this.prev = prev;
    }

    public Node() {
    }
}
