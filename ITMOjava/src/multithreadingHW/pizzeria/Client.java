package multithreadingHW.pizzeria;

import java.util.concurrent.BlockingQueue;

public class Client implements Runnable {
    private BlockingQueue<Order> newOrderQueue;
    private BlockingQueue<Order> readyQueue;
    private Order order;

    public Client(BlockingQueue<Order> newOrderQueue, BlockingQueue<Order> readyQueue, Order order) {
        this.newOrderQueue = newOrderQueue;
        this.readyQueue = readyQueue;
        this.order = order;
    }

    @Override
    public void run() {
        try {
            newOrderQueue.put(order);
            System.out.println("Client takes " + order + " to waiter");
            Thread.sleep(3000);
            readyQueue.take();
            System.out.println("Client gives the order from chef" + order);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
