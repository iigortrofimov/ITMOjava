package lesson22;

public class SomeClass {
    // чтение и запись будут атомарными
    // чтение всегда вернет актуальное значение из памяти
    private static volatile boolean run = true; // напрямую к памяти

    public static void main(String[] args) throws InterruptedException {
        for (int i = 0; i < 1000; i++) {
            new SomeThread().start();
        }
        Thread.sleep(3000);
        run = false;
    }

    private static class SomeThread extends Thread {
        @Override
        public void run() {
            while (run) {
                try {
                    sleep(1);
                } catch (InterruptedException e) {
                    run = false;
                    e.printStackTrace();
                }
            }
        }
    }
}

// ==========================================================================================
