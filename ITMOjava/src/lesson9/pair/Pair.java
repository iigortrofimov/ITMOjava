package lesson9.pair;

import lesson9.classes.Book;

public class Pair <K, V>{
    private K key;
    private V value;


    public Pair(K key, V value) {
        this.key = key;
        this.value = value;
    }

    public K getKey() {
        return key;
    }

    public V getValue() {
        return value;
    }

    public static void main(String[] args) {
        Pair<Integer, String> pair = new Pair<>(12, "значение"); // дженерик с примитивом работать не могут
       Integer key = pair.getKey();
       String value = pair.getValue();


      //  Pair<String, Book> pair1 = new Pair<>);
       // Book
    }
}
