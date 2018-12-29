package lesson26;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;

public class UdpServer extends Thread {
    @Override
    public void run() {
        try {
            DatagramSocket datagramSocket = new DatagramSocket(8080); // если не указывать,то рандомный
            byte[] buff = new byte[1];
            DatagramPacket packet = new DatagramPacket(buff, buff.length);
            datagramSocket.receive(packet);
            System.out.println(buff[0] + " " + packet.getLength());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
