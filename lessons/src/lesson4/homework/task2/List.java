package lesson4.homework.task2;

public class List {
    private ListElements head;
    private  ListElements tail;
    void addFront(int data) {
        ListElements a = new ListElements();
        a.data = data;
        if (head == null){
            head = a;
            tail = a;
        } else {
            a.next = head;
            head = a;
        }
    }
    void addBack(int data){
        ListElements a = new ListElements();
        a.data = data;
        if (tail == null){
            head = a;
            tail = a;
        } else {
            tail.next = a;
            tail = a;
        }

    }

}
