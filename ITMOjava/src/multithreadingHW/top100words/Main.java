package multithreadingHW.top100words;

/*      Используя блокирующие очереди сосчитать топ слов как из
        предыдущего задания. Вариантом решения может быть:
        main создает потоки Worker, которые ждут строки из
        очереди на методе take(). Далее main читает с диска
        и добавляет строки в очереди, последними строками
        будут стоп-строки.

        Worker'ы при получении стоп-строки добавляют
        свою внутреннюю мапу в следующую очередь и
        завершают свою работу.

        main же ждет мапы со всех воркеров на второй
        очереди и результат собирает в результирующую мапу.

        В итоге, не должно быть нигде явной синхронизации
        и использованы две блокирующие очереди*/

import java.io.*;
import java.util.*;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;

public class Main {
    public static void main(String[] args) {
        int processorsCount = Runtime.getRuntime().availableProcessors();
        List<Thread> threads = new ArrayList<>();
        BlockingQueue<String> strings = new ArrayBlockingQueue<>(10, true);
        BlockingQueue<Map<String, Integer>> mapBlockingQueue = new ArrayBlockingQueue<>(processorsCount, true);
        Map<String, Integer> resultMap = new HashMap<>();

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter file's path");
        String filePath = scanner.nextLine();

        for (int i = 0; i < processorsCount; i++) {
            threads.add(new Thread(new Worker(strings, mapBlockingQueue)));
        }
        for (Thread thread : threads) {
            thread.start();
        }

        try (BufferedReader buff = new BufferedReader(new InputStreamReader(new FileInputStream(filePath)))) {
            String line;
            while ((line = buff.readLine()) != null) {
                strings.put(line);
            }
            for (int i = 0; i < processorsCount; i++) {
                strings.put("STOP_LINE");
            }
            for (Thread thread : threads) {
                thread.join();
            }
        } catch (IOException | InterruptedException e) {
            e.printStackTrace();
        }

        for (Map<String, Integer> map : mapBlockingQueue) {
            for (Map.Entry entry : map.entrySet()) {
                resultMap.merge(entry.getKey().toString(), (Integer) entry.getValue(),
                        (oldVal, newVal) -> oldVal + newVal);
            }
        }
        resultMap.entrySet()
                .stream()
                .sorted(Map.Entry.<String, Integer>comparingByValue().reversed())
                .limit(100)
                .forEach(System.out::println);
    }
}
