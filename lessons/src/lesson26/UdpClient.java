package lesson26;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetSocketAddress;

public class UdpClient extends Thread {
    @Override
    public void run() {
        DatagramPacket packet = new DatagramPacket(new byte[]{10}, 1,
                new InetSocketAddress("localhost", 8080));
        try {
            DatagramSocket datagramSocket = new DatagramSocket();
            datagramSocket.send(packet);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        new UdpServer().start();
        new UdpClient().start();
    }
}
