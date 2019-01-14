package multithreadingHW.pizzeria;

import java.util.concurrent.BlockingQueue;

public class Waiter implements Runnable {
    private BlockingQueue<Order> newOrderQueue;
    private BlockingQueue<Order> cookingQueue;
    private Order order;

    public Waiter(BlockingQueue<Order> newOrderQueue, BlockingQueue<Order> cookingQueue) {
        this.newOrderQueue = newOrderQueue;
        this.cookingQueue = cookingQueue;
    }

    @Override
    public void run() {
        while (true)
            try {
                if (newOrderQueue.isEmpty()) {
                    Thread.sleep(2000);
                }
                order = newOrderQueue.take();
                cookingQueue.put(order);
                System.out.println( "Waiter sends " + order + " to the Chef");
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
    }
}
