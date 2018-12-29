package lesson16.printApp;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class PrintServer {

    private int port;

    public PrintServer(int port) {
        this.port = port;
    }

    private void start() throws IOException {
        try (ServerSocket serverSocket = new ServerSocket(port)) {
            System.out.println("Serve started on: " + serverSocket.getInetAddress());

            while (true) {
                Socket socket = serverSocket.accept();
                try {
                    getMessage(socket);
                } catch (ClassNotFoundException e) {
                    e.printStackTrace();
                } finally {
                    socket.close();
                }
            }
        }
    }

    private void getMessage(Socket socket) throws IOException, ClassNotFoundException {
        String host = socket.getInetAddress().getHostAddress();
        System.out.println(host);

        try (ObjectInputStream objIn = new ObjectInputStream(socket.getInputStream())) {
            Object object = objIn.readObject();
            printMess((Message) object);
        }
    }

    private void printMess(Message msg) {
        System.out.println("Message: " + msg.getMessText() + " from " + msg.getSender());
    }

    public static void main(String[] args) throws IOException {
        if (args == null || args.length == 0) {
            throw new IllegalArgumentException("Port must be spec");
        }
        int port = Integer.parseInt(args[0]);
        PrintServer printServer = new PrintServer(port);
        printServer.start();
    }
}
