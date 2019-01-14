package multithreadingHW.pizzeria;

/*      Сделать пиццерию на очередях: клиенты складывают
        заказы в очередь 1, официанты из нее заказы
        забирают и добавляют в очередь 2, из которой
        повар заказ забирает и готовит, после чего он
        готовые блюда складывает в очередь 3, из который
        клиенты будут забирать заказы. Сами же клиенты
        блокируются на очереди 3, официанты на очереди 1,
        а повара - на очереди 2.*/

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;

public class Pizzeria {
    public static void main(String[] args) {

        BlockingQueue<Order> newOrderQueue = new ArrayBlockingQueue<>(5, true);
        BlockingQueue<Order> cookingQueue = new ArrayBlockingQueue<>(5, true);
        BlockingQueue<Order> readyQueue = new ArrayBlockingQueue<>(5, true);

        Order pizza1 = new Order("Margarita");
        Order pizza2 = new Order("Carbonara");
        Order pizza3 = new Order("Mexico");
        Order pizza4 = new Order("BeefPizza");

        new Thread(new Client(newOrderQueue, readyQueue, pizza1)).start();
        new Thread(new Client(newOrderQueue, readyQueue, pizza2)).start();
        new Thread(new Client(newOrderQueue, readyQueue, pizza3)).start();
        new Thread(new Client(newOrderQueue, readyQueue, pizza4)).start();
        new Thread(new Waiter(newOrderQueue, cookingQueue)).start();
        new Thread(new Chef(cookingQueue, readyQueue)).start();


    }
}
