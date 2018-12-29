package lesson4.homework.task2;

public class List {
    private Noda head;


    void addNoda(int data) {
        Noda noda = new Noda();
        noda.data = data;
        if (head == null) {
            head = noda;

        } else {
            noda.next = head;
            head = noda;
        }
    }
    void show() {
        Noda show = head;
        while (show != null) {
            System.out.println(show.data);
            show = show.next;
        }
    }
    void removeNoda(int data){
        if (head == null){
            return;
        }
    if (head.data == data){
        head = head.next;
        return;
    }
    Noda index = head;
    while (index.next != null){
        if (index.next.data == data){
            index.next = index.next.next;
            return;
        }
        else index = index.next;
    }
    }
}
