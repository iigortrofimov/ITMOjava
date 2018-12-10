package lesson20;

public class Lesson20 {
    public static void main(String[] args) throws InterruptedException {
        System.out.println(Thread.currentThread().getName());

        //Methods of Thread class
        // currentThread(); -для получения текущего потока
        //setName(str); задает имя потока
        //getName(); - получаем имя
        // join();
        //isAlive();
        // isInterrupted  - работа с флагами
        //interrupt()
        Thread thread = new Thread(); // creation thread
        //thread.start(); //


        Thread thread1 = new MyThread();  // for "extends"
        //thread1.start();

        Thread thread2 = new Thread(new OtherThread());
        //thread2.start();

//        for (int i = 0; i < 5; i++) {
//            Thread thread3 = new Thread(new OtherThread());
//            thread3.setName("T - " + i);
//            thread3.start();
//        }

//        Thread thread4 = new Thread(new Runnable() {
//            @Override
//            public void run() {
//                System.out.println("Running: " + Thread.currentThread().isAlive());
//                System.out.println("Running: " + Thread.currentThread().getState());
//            }
//        });
//        System.out.println("Before start: " + thread4.isAlive());
//        System.out.println("Before start: " + thread4.getState());
//        thread4.start();
//        //ожидаем пока поток завершится
//        thread4.join();
//        System.out.println("After start: " + thread4.isAlive());
//        System.out.println("After start: " + thread4.getState());


//        Thread thread5 = new Thread(new Runnable() {
//            @Override
//            public void run() {
//                while (true) {
//                    try {
//                        Thread.sleep(1000); // приостановление потока на указанное количество миллесекунд
//                    } catch (InterruptedException e) {
//                        e.printStackTrace();
//                    }
//                }
//            }
//        });
//        thread5.start();

        //** Программа будет работать пока есть незавершенные потоки
        // это касается основных потоков
        // Потоки отмечанные как daemon будут оставновлены, сразу после остановки
        // последнего основного потока


//        thread5.setDaemon(true);
//        thread5.start();

        /* оставновка потоков
         1. поток выполнил все инсткуции и вышел из метода run;
         2. в методе run было выброшенно необраебатываемое исключение
         3. остановилась JVM
         4. это был daemon поток и последний основной поток остановил свою работу */

        // механизм прерывания
        Thread thread7 = new Thread(new Runnable() {
            @Override
            public void run() {
                while (!Thread.currentThread().isInterrupted()) { // прерван // не прерван
                    try {
                        System.out.println("Thread7");
                        Thread.sleep(1000); // приостановление потока на указанное количество миллесекунд
                    } catch (InterruptedException e) {
                        //Thread.currentThread().interrupt(); // переводит в false (прерывание)
                        e.printStackTrace();
                    }
                }
            }
        });

        thread7.start();
        Thread.sleep(2000);
        System.out.println(thread7.isInterrupted());
        thread7.interrupt();
    }
}

//for creation own Thread you need to extend class Thread or implement Runnable
class MyThread extends Thread {
    @Override
    public void run() {
        System.out.println("MyThread " + Thread.currentThread().getName());
    }
}

class OtherThread implements Runnable {
    @Override
    public void run() {
        System.out.println("OtherThread " + Thread.currentThread().getName());
    }
}
