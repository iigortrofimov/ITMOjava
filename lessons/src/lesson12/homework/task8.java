package lesson12.homework;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;

public class task8 {
  /*  Создать словарь (Map<String, String>) и внести в него десять записей по принципу: «фамилия» - «дата рождения».
    Удалить из словаря всех людей, родившихся летом.*/

    public static void main(String[] args) {
        Map<String, String> map = new HashMap<>();
        map.put("Petrov", "12 января 1995");
        map.put("Kozlov", "12 февраля 1995");
        map.put("Dubrov", "12 марта 1995");
        map.put("Ivanov", "12 апреля 1995");
        map.put("Trof", "12 мая 1995");
        map.put("Alanin", "12 июня 1995");
        map.put("Mishukov", "12 июля 1995");
        map.put("Mamaev", "12 августа 1995");
        map.put("Putin", "12 сентября 1995");
        System.out.println(map);
        System.out.println("\n");

        Iterator<HashMap.Entry<String, String>> iterator = map.entrySet().iterator();
        while (iterator.hasNext()) {
            HashMap.Entry<String, String> pair = iterator.next();
            if (pair.getValue().contains("июня") || pair.getValue().contains("июля")
                    || pair.getValue().contains("августа")) {
                iterator.remove();
            }
        }
        System.out.println(map);
    }
}
