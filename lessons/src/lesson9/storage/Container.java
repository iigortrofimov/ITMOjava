package lesson9.storage;


class Container <T>{
    T element;

    T next;

    public Container(T element) {
        this.element = element;
    }
}
