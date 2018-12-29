package lesson26;

import java.io.IOException;
import java.io.OutputStream;
import java.net.InetSocketAddress;
import java.net.Socket;

public class TcpClient extends Thread{
    @Override
    public void run() {
        try(Socket socket = new Socket()){
            socket.connect(new InetSocketAddress("localhost", 8080));
            OutputStream out = socket.getOutputStream();
            out.write(12);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
