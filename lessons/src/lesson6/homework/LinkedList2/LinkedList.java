package lesson6.homework.LinkedList2;

public class LinkedList implements List, Stack, Queue {
    private Node head;
    private Node end;
    private int size = 0;
    @Override
    public void add(int data, int index) { // добавляет объект на указанную позицию (index)
        if (index>=0 && index<=size) {
            if (index == 0) shift(data);
            else if (index == size) push(data);
            // не понятно, как добавлять и удалять по индексу.
        }

    }

    @Override
    public void remove(int index) { // удаляет элемент с указанной позиции (index)
             // не понятно, как добавлять и удалять по индексу.
    }

    @Override
    public Object get(int index) { // находит и возвращает элемент по индексу (index)
        return null;
    }

    @Override
    public int size() { //  возвращает размер списка
        return size;
    }

    @Override
    public void shift(int data) { //  добавляет объект в начало списка
        Node node = new Node();
        node.data = data;
//        node.prev = end;
//        node.next = null;

        if (size == 0) {
            head = node;
            end = node;
            size++;
//            node.prev = end;
//            node.next = null;
        } else {
            node.next = head;
           // node.next = null;
            head.prev = node;
            head = node;

            size++;
        }
    }

    @Override
    public void unshift() { // удаляет элемент из начала списка
        if (size == 0) {
            return;
        }else {
            head = head.next;
            head.prev = null;
            size--;
            return;
        }

    }

    @Override
    public void push(int data) { // добавляет объект в конец списка
        Node node = new Node();
        node.data = data;

        if (size == 0) {
            head = node;
            end = node;
            size++;
        } else
            end.next = node;
            node.prev = end;
        end = node;
        size++;
    }

    @Override
    public void pop() { // удаляет элемент из конца списка
        if (size == 0) {
            return;
        }else {
            end = end.prev;
            end.next = null;
            size--;
            return;
        }

    }
    void showList() {
        Node show = head;
        while (show != null) {
            System.out.println(show.data);
            show = show.next;
        }
    }
}
