package lesson12;

import org.omg.CORBA.MARSHAL;

import java.util.*;

public class MapExample {
    public static void main(String[] args) {
        User user = new User(2, "Petr");
        User user2 = new User(1, "Metr");
        User user3 = new User(3, "Ketr");
        System.out.println(System.identityHashCode(user));
        System.out.println(user.hashCode());

        // Map
        //     1. Хранение данных в паре  ключ - значение
        // ключи не дублируются
        // хранение зависит от реализации
        // Могут хранить любые типы данны
        // (использование null в качестве ключа зависит от реализации
        // boolean containsKey (Object

        Map<Integer, String> hashMap = new HashMap<>();
        hashMap.put(7, "Hpops");
        hashMap.put(1, "pops");
        hashMap.put(2, "qwerty");
        hashMap.put(2, "qwerty");
        hashMap.put(2, "pops");
        hashMap.put(4, "pops");
        hashMap.put(5, "lpops");
        hashMap.put(null, "NULL");
        System.out.println(hashMap);
        System.out.println(hashMap.get(1));
        System.out.println(hashMap.get(null));
        System.out.println(hashMap.entrySet());

        // to iterate elements

        for (Map.Entry entry : hashMap.entrySet()) {
            System.out.print("Key: " + entry.getKey() + " Value: " + entry.getValue() + " | ");
        }

        System.out.println();

        Map<Integer, String> linkedHashMap = new LinkedHashMap<>();
        linkedHashMap.put(7, "Silly");
        linkedHashMap.put(1, "Billy");
        linkedHashMap.put(2, "Willy");
        linkedHashMap.put(1, "Tilly");
        linkedHashMap.put(3, "Hilly");
        linkedHashMap.put(4, "Hilly");
        System.out.println(linkedHashMap);


        //лист ключей
        //        List keyList = new ArrayList(map.keySet());
        //лист значений
        //        List valueList = new ArrayList(map.valueSet());
        //лист ключ-значения
        //        List entryList = new ArrayList<>(map.entrySet());

//        TreeSet<User> mapuser = new TreeSet<>();
//       // mapuser.add(user);
//        mapuser.add(user2);
//        mapuser.add(user3);
//
//        System.out.println(mapuser);



    }
}
