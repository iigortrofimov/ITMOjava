package multithreadingHW.top100words;

import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.BlockingQueue;

public class Worker implements Runnable {
    private BlockingQueue<String> strings;
    private BlockingQueue<Map<String, Integer>> mapBlockingQueue;
    private Map<String, Integer> innerMap;

    public Worker(BlockingQueue<String> strings, BlockingQueue<Map<String, Integer>> mapBlockingQueue) {
        this.strings = strings;
        this.mapBlockingQueue = mapBlockingQueue;
        this.innerMap = new HashMap<>();
    }

    @Override
    public void run() {
        while (true) {
            String str = null;
            try {
                str = strings.take();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            if (str.equals("STOP_LINE")) {
                try {
                    mapBlockingQueue.put(innerMap);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                break;
            }
            String[] words = str.toLowerCase().replaceAll("\\pP", " ").trim().split("\\s");
            for (String s : words) {
                if (s.equals("")) {
                    continue;
                }
                innerMap.merge(s, 1, (oldVal, newVal) -> oldVal + newVal);
            }
        }
    }
}
