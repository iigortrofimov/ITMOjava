package chat;

import lesson16.printApp.Message;

import java.io.IOException;
import java.net.Socket;
import java.util.Scanner;

public class Client {
    private IOConnection connection;
    private Scanner in = new Scanner(System.in);

    private Client(IOConnection connection) {
        this.connection = connection;
    }

    public void start() {
        System.out.println("Enter your name");
        String name = in.nextLine();

        Thread reader = new Thread(new Reader(connection));
        reader.start();

        System.out.println("Enter message");

        while (true) {
            String msg = in.nextLine();
            // реализовать возможность выхода (exit)
            //реализовать возможность сменить имя пользователя (nicl) если такая команда, то -> введите имя

            if (msg != null && !msg.isEmpty()) {
                Message message = new Message(name, msg);
            }
        }
//        ConsoleHelper.writeString("Enter your name ");
//        String name = ConsoleHelper.readString();
//        while (true){
//            ConsoleHelper.writeString("Enter your message ");
//            String message = ConsoleHelper.readString();
    }

    private class Reader implements Runnable {
        private final IOConnection connection;

        private Reader(IOConnection connection) {
            this.connection = connection;
        }

        @Override
        public void run() {

            while (!Thread.currentThread().isInterrupted()) {
                Message message = connection.recieve();
                System.out.println(message);
            }

        }
    }

    public static void main(String[] args) throws IOException {
        Client client = new Client(
                new IOConnection(new Socket("127.0.0.1", 8080)));
        client.start();
    }
}

