package other.djenerics;

import java.lang.reflect.Array;
import java.util.Arrays;

public class PairD <T, S> {
    T obj1;
    S obj2;

    public PairD(T arg1, S arg2) {
        this.obj1 = arg1;
        this.obj2 = arg2;
    }

    void showTypes() {
        System.out.println("Type T: " + obj1.getClass().getName());
        System.out.println("Type S: " + obj2.getClass().getName());
    }

    public T getObj1() {
        return obj1;
    }

    public S getObj2() {
        return obj2;
    }

    public static void main(String[] args) {
        PairD<String, Integer> pairD = new PairD<>("QWERTY", 123);
        pairD.showTypes();

        String str = pairD.getObj1();
        System.out.println("value: " + str);

        int value = pairD.getObj2();
        System.out.println("value: " + value);
    }
}
