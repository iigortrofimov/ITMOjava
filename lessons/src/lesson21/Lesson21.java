package lesson21;

import lesson7.homework.Pupil;

import java.util.ArrayList;
import java.util.List;

public class Lesson21 {
    public static void main(String[] args) throws InterruptedException {
        Sync sync = new Sync();
        List<Sync.Adder> adderList = new ArrayList<>(100);

        // create Threads

        for (int i = 0; i < 100; i++) {
            adderList.add(sync.new Adder());
        }

        // star Throws
        for (Sync.Adder adder : adderList) {
            adder.start();
        }
        // ждем завершения
        for (Sync.Adder adder : adderList) {
            adder.join();
        }

        // выводим информацию
        System.out.println("Result: " + sync.counter);
    }
}

// общий участок памяти
// который будем изменять из разных потоков
class Sync {
    int counter;

    private synchronized void increment() {
        // this
        counter++;
    }


    public class Adder extends Thread {
        @Override
        public void run() {
            for (int i = 0; i < 100_000; i++) {
                // counter++;
                // все что внутри блока , одновремнно может выполнять только один поток
                /*synchronized (Sync.this) { // -  объект на котром происходит синхронизация
                    counter++;
                }*/

                increment();
            }
        }
    }
}

class Storage {
    int bookCount = 0;

    public synchronized void getBook() throws InterruptedException {
        System.out.println("getBook START");
        while (bookCount < 1) {
            wait(); // блокирует поток  пока..
        }
        bookCount--;
        System.out.println("One book took away from Library  \n" +
                "Books in Library: " + bookCount);

        notify(); // wake up someone random Thread  // notifyAll();

        System.out.println("getBook FINISH");
    }

    public synchronized void putBook() throws InterruptedException {
        System.out.println("putBook START");
        while (bookCount >= 5) {
            wait();
        }
        bookCount++;
        System.out.println("One book put into Library \n" +
                "Books in Library: " + bookCount);
        //notify();
        System.out.println("putBook FINISH");
    }
}

class Put implements Runnable {

    Storage storage;

    public Put(Storage storage) {
        this.storage = storage;
    }

    @Override
    public void run() {
        for (int i = 1; i < 10; i++) {
            try {
                storage.putBook();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

class Get implements Runnable {
    Storage storage;

    public Get(Storage storage) {
        this.storage = storage;
    }

    @Override
    public void run() {
        for (int i = 1; i < 10; i++) {
            try {
                storage.getBook();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

class Library {
    public static void main(String[] args) {
//        Storage storage = new Storage();
//        Put put = new Put(storage);
//        Get get = new Get(storage);
//
//        new Thread(put).start();
//        new Thread(get).start();


        Object object = new Object();
        Object object2 = new Object();

        Thread thread1 = new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("Thread 1 start");
                synchronized (object) {
                // обработка данных
                    try {
                        Thread.sleep(500);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    System.out.println("Thread 1 locked obj1");
                    synchronized (object2) {

                        System.out.println("Thread 1 locked both obj");
                    }
                }
            }
        });
        Thread thread2 = new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("Thread 2 start");
                synchronized (object2) {

                    System.out.println("Thread 2 locked obj2");
                    synchronized (object) {

                        System.out.println("Thread 2 locked both");
                    }
                }
            }
        });
        thread1.start();
        thread2.start();
    }
}


