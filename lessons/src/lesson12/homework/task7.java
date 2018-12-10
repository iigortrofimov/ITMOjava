package lesson12.homework;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class task7 {
   /* Создать словарь (Map<String, String>) занести в него десять записей по принципу «Фамилия» - «Имя».
    Проверить сколько людей имеют совпадающие с заданным именем или фамилией.
    Результат вывести на экран*/

   // Совпадений по фамилии же быть не может (фамилия же выступает "ключом")?
    // количество совпадению по фамилии всегда == 1;

    public static Map<String, String> createMap() {
        Map<String, String> map = new HashMap<>();
        map.put("Petrov", "Ivan");
        map.put("Kozlov", "Igor");
        map.put("Dubrov", "Egor");
        map.put("Ivanov", "Semen");
        map.put("Trof", "Ivan");
        map.put("Alanin", "Vitas");
        map.put("Mishukov", "Roma");
        map.put("Mamaev", "Lesha");
        map.put("Putin", "Ivan");
        map.put("Alanin", "Kik");
        return map;
    }

    public static int getFirstNameCount(Map<String, String> library, String name) {
        int count = 0;
        for (Map.Entry<String, String> pair : library.entrySet()) {
            String firstName = pair.getValue();
            if (firstName.equals(name)) {
                count++;
            }
        }
        return count;
    }

    public static int getLastNameCount(Map<String, String> library, String name) {
        int count = 0;
        for (Map.Entry<String, String> pair : library.entrySet()) {
            String lastName = pair.getKey();
            if (lastName.equals(name)) {
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        System.out.println(getFirstNameCount(createMap(), "Ivan"));
        System.out.println(getLastNameCount(createMap(), "Alanin"));
    }
}
