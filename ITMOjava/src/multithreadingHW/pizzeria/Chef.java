package multithreadingHW.pizzeria;

import java.util.concurrent.BlockingQueue;

public class Chef implements Runnable {
    private BlockingQueue<Order> cookingQueue;
    private BlockingQueue<Order> readyQueue;
    private Order order;

    public Chef(BlockingQueue<Order> cookingQueue, BlockingQueue<Order> readyQueue) {
        this.cookingQueue = cookingQueue;
        this.readyQueue = readyQueue;
    }

    @Override
    public void run() {
        while (true) {
            try {
                if (cookingQueue.isEmpty()) {
                    Thread.sleep(2000);
                }
                order = cookingQueue.take();
                System.out.println("Chef takes " + order + " and cooks the order");
                readyQueue.put(order);
                System.out.println(order + "is done and Chef gives the order to the Client");
                System.out.println();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
