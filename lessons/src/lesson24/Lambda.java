package lesson24;

import java.awt.*;
import java.util.*;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;

public class Lambda {

    private static int someVar = 12;

    public static void main(String[] args) {
        /** syntax
         (args) -> body
         () - > body;
         () -> {
         body
         in several strings
         return (maybe not return)
         }*/

        new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("Hello");
            }
        });

        new Thread(() -> System.out.println("Hello"));

        Runnable runnable = () -> System.out.println("Hello");
        new Thread(runnable);

        Operation plus = (a, b) -> a + b;
        Operation minus = (a, b) -> a - b;

        double result = plus.execute(10, 15);
        double result2 = minus.execute(18, 8);

        //System.out.println(result + " " + result2);

        ButtonFactory<Button> factory = Button::new; // new ссылка на консруктор (link to the constructor)
        Button button = factory.set("Cancel", "Pink");

        int someLocalVar = 12;

        Operation operation = (a, b) -> {
            someVar -= a;
            //  someLocalVar += b; only with static variable
            return someVar;
        };

        // Предикаты  интерфейы  package function
        Predicate<Integer> pos = (num) -> num > 0;
        boolean predicateResult = pos.test(4);

        Predicate<Integer> neg = (num) -> num < 0;
        boolean predicatRes = neg.test(-4);

        boolean predicatRes2 = pos.or(neg).test(20);
        // System.out.println(predicatRes2);
        boolean predicatRes3 = pos.and(neg).test(20);
        // System.out.println(predicatRes3);
        // если парамент мктода описан лямбдой, то можно передавать его в каяетсве аргумента

        // Функция
        Function<Integer, Integer> pLusTen = (a) -> (a + 10);// first type to enter, second to return value
        Function<Integer, Integer> minusSeven = (a) -> (a - 7);
        Function<Integer, Integer> pLusSix = (a) -> (a + 6);

        int functionRes = pLusTen.apply(20);
        System.out.println(functionRes);
        int functionRes1 = minusSeven.andThen(minusSeven).apply(30);
        System.out.println(functionRes1);
        int functionRes2 = pLusSix.compose(pLusTen).apply(20);
        System.out.println(functionRes2);

        // Consumer
        Consumer<Button> makeReset = (button1) -> button1.setValue("Reset");
        makeReset.accept(button);
        System.out.println(button);


        // Компараторы
        Button button1 = new Button("First", "Blue");
        Button button2 = new Button("Second", "Blue");
        Comparator<Button> buttonComparator = (b1, b2) -> b1.getValue().compareTo(b2.getValue());
        int compareRes = buttonComparator.compare(button1, button2);
        System.out.println(compareRes);
        compareRes = buttonComparator.reversed().compare(button1, button2);
        System.out.println(compareRes);

        /// forEach (лямбда выражение)

        List<Integer> integers = new ArrayList<>(Arrays.asList(23, 26, 28, -12, 0));
        List<Integer> integers1 = new ArrayList<>();
        integers.forEach((s) -> System.out.print(s + " "));
        System.out.println("\n----------------------------------------------");
        integers.forEach((s) -> integers1.add(s + 10));
        System.out.println(integers1);

        // removeIf()

        integers.removeIf((s) -> s < 20);
        System.out.println(integers);
        integers.removeIf(pos);
        System.out.println(integers);

        //Map.forEach

        Map<String, String> books = new HashMap<>();
        books.put("Book1", "WarAndPeaсe");
        books.put("Book2", "WarAndPeaсe2");

        books.forEach((key, value) -> System.out.println("Title: " + key + " Name: " + value));

        // Map.compute()
        books.compute("Book1", (key, value) -> value + " With supplementation");
        System.out.println(books);

        //books.computeIfAbsent()
        //books.computeIfPresent()

        // Map.getOrDefault
        String bookName = books.getOrDefault("Book3", "Book has nt got name");
        System.out.println(bookName);
    }
}

@FunctionalInterface
        // ony one abstract method
interface Operation {
    double execute(int a, int b);
}

interface ButtonFactory<T extends Button> {
    T set(String value, String colour);

}

class Button {
    private String value;
    private String colour;

    public Button(String value, String colour) {
        this.value = value;
        this.colour = colour;
    }

    public void setValue(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }

    @Override
    public String toString() {
        return "Button{" +
                "value='" + value + '\'' +
                ", colour='" + colour + '\'' +
                '}';
    }
}
