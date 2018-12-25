package lesson25;

import lesson6.Calculator.Operations;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.util.*;
import java.util.function.Function;
import java.util.stream.*;

import static java.util.stream.Collectors.counting;
import static java.util.stream.Collectors.groupingBy;
import static java.util.stream.Collectors.toMap;


public class StreamAPI {
    public static void main(String[] args) throws IOException {
        // create stream
        Integer[] arr = {15, 45, 44, 46, -12, 0};
        Stream<Integer> arrStream = Arrays.stream(arr);
        List<Integer> list = new ArrayList<>(Arrays.asList(arr));
        Stream<Integer> listStream = list.stream();
        Stream<String> stringStream = Stream.of("qwe", "ty", "yep");
        File file = new File("wp.txt");
        Stream<String> fileStream = Files.lines(file.toPath());

        // primitive

        IntStream intStream = IntStream.range(34, 565);
        LongStream longStream = LongStream.builder().add(3).add(3333).build();

        // удалить из списка элементы меньше 20
        // каждый элемент увеличить на 10;
        // вывести в отсортированном полрядке

        list = new ArrayList<>(Arrays.asList(arr));
        list.stream()
                .filter(s -> s > 20)
                .map(s -> s + 10)
                .distinct() // only unique value
                .sorted()
                .forEach(System.out::println);
        //-----------------------------------------------------------------------

        Optional<Integer> optional = Stream.of(1, 4, 6).filter(a -> a > 4).findFirst();

        Integer i = optional.orElse(0);

        Integer res = Stream.of(1, 2, 3).reduce(0, (k, j) -> k + j);
        System.out.println(res);

        // top 10
        // получили стрим из файла

        Stream<String> stringStream1 = Files.lines(file.toPath())
                // указываем, что стрим долен быть параллельным
                .parallel()
                // убрать значики прпинияния  \\ работатет построчно
                .map(line -> line.toLowerCase()
                        .replaceAll("\\pP", " "))
                // строку разбиваем на слова
                .flatMap(line -> Arrays.stream(line.split(" ")))
                // обрезка пробелов
                .map(String::trim)
                .filter(word -> !"".equals(word));

//        Map<String, Long> map = stringStream1
//                //.collect(groupingBy(identity(), counting()))
//                .collect(groupingBy(Function.identity(), counting()))
//                .entrySet().parallelStream()
//                .sorted((e1, e2) -> e2.getValue().compareTo(e1.getValue()))
//                .limit(10)
//                .collect(toMap(Map.Entry::getKey, Map.Entry::getValue));
//                System.out.println(map);


        // the

//        Long count = stringStream1
//                .filter("the"::equals)
//                .count();
//        System.out.println(count);
//
//        List <String> list1Res = stringStream1
//                .filter(list1 -> list1.equals("the"))
//                . collect(Collectors.toList());
//        System.out.println(list1Res);


        arrStream = Arrays.stream(arr);
        IntSummaryStatistics statistics = arrStream
                .collect(Collectors.summarizingInt(p -> p - 1));
        System.out.println(statistics);

        // найти пользователей в возрасте от 18 до 40
        // найти максимальный возраст
        // найти средний возраст

        User user1 = new User("Ivan", 23);
        User user2 = new User("Kolya", 33);
        User user3 = new User("Bill", 21);
        User user4 = new User("Tom", 50);
        User user5 = new User("Ken", 12);
        User user6 = new User("Nill", 61);
        User user7 = new User("Zhenya", 37);

        List<User> usersList = new ArrayList<>();
        usersList.add(user1);
        usersList.add(user2);
        usersList.add(user3);
        usersList.add(user4);
        usersList.add(user5);
        usersList.add(user6);
        usersList.add(user7);

        usersList.stream()
                .filter(user -> user.getAge() >= 18 && user.getAge() < 40)
                .forEach(System.out::println);

        IntSummaryStatistics statistics1 = usersList.stream()
                .collect(Collectors.summarizingInt(User::getAge));
        System.out.println(statistics1.getMax());

//        usersList.stream()
//                .mapToInt()


        // Получить сумму нечетных чисел
        //Integer[] arr = {15, 45, 44, 46, -12, 0};

        list = new ArrayList<>(Arrays.asList(arr));

        Integer sum = list.stream()
                .filter(num -> num % 2 != 0)
                .reduce((c, k) -> c + k)
                .get();
        System.out.println(sum);


    }
}


class User {
    private String name;
    private int age;

    public User(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}