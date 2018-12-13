package chat;

import lesson16.printApp.Message;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Set;
import java.util.concurrent.BlockingDeque;
import java.util.concurrent.CopyOnWriteArraySet;
import java.util.concurrent.LinkedBlockingDeque;

public class Server {
    private int port;

    private final Set<IOConnection> connections = new CopyOnWriteArraySet<>();
    private final BlockingDeque<Message> messageBlockingDeque = new LinkedBlockingDeque<>();

    public Server(int port) {
        this.port = port;
    }

    private void start() throws IOException {
        new Thread(new Writer()).start();

        try (ServerSocket serverSocket = new ServerSocket(port)) {

            System.out.println("Server started on: " + serverSocket);

            IOConnection connection;

            while (true) {
                Socket socket = serverSocket.accept();
                connection = new IOConnection(socket);
                connections.add(connection);

                new Thread(new Reader(connection)).start();
            }

        }
    }

    private class Writer implements Runnable {
        @Override
        public void run() {
            while (!Thread.currentThread().isInterrupted()) {
                try {
                    Message message = messageBlockingDeque.take();
                    for (IOConnection connection : connections) {
                        connection.send(message);
                    }
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
    }

    private class Reader implements Runnable {
        private IOConnection connection;

        public Reader(IOConnection connection) {
            this.connection = connection;
        }

        @Override
        public void run() {
            while (!Thread.currentThread().isInterrupted()) {
                Message message = connection.recieve();
                messageBlockingDeque.add(message);
                System.out.println(message);
            }
        }
    }

    public static void main(String[] args) {
        Server server = new Server(8080);

    }
}
