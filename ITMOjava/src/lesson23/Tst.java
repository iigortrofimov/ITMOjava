package lesson23;

import java.util.concurrent.*;

public class Tst {
    public static void main(String[] args) {
        ExecutorService service = Executors.newFixedThreadPool(2);

        Future<Integer> res = service.submit(new SomeClass());
        try {
            Integer integer = res.get(10, TimeUnit.MILLISECONDS);
            System.out.println("integer: " + integer);
        } catch (InterruptedException | ExecutionException | TimeoutException e) {
            res.cancel(true);
            e.printStackTrace();
        }

        service.shutdown();
        try {
            service.awaitTermination(2, TimeUnit.MILLISECONDS);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

    }

    public static class SomeClass implements Callable<Integer> {

        @Override
        public Integer call() throws Exception {
            return 123;
        }
    }
}
