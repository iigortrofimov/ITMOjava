package lesson26;

import java.io.IOException;
import java.io.InputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class TcpServer extends Thread {
    @Override
    public void run() {
        try (ServerSocket serverSocket = new ServerSocket(8080)) {
            try (Socket socket = serverSocket.accept()) {
                InputStream in = socket.getInputStream();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
