package other.djenerics;

public class DjenericsTest<T>{
    T a;

    public DjenericsTest(T something) {
        this.a = something;
    }

    public T getA() {
        return a;
    }
    void showType(){
        System.out.println("Type T: " + a.getClass().getName());

    }


    public static void main(String[] args) {
        DjenericsTest<Integer> dInt = new DjenericsTest<Integer>(123);
        dInt.showType();
        int value = dInt.getA();
        System.out.println("value: " + value);

        DjenericsTest<String> dStr= new DjenericsTest<String>("QWERTY");
        dStr.showType();
        String str = dStr.getA();
        System.out.println("value " + str);


    }
}
