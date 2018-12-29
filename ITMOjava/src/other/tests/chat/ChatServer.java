package other.tests.chat;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;

public class ChatServer {
    private static Socket clientSocket;// socket for communication
    private static ServerSocket serverSocket; // serversocket
    private static BufferedReader in; //  reading stream from socket
    private static BufferedWriter out; // writing stream to socket

    public static void main(String[] args) {
        try {
            try {
                serverSocket = new ServerSocket(4004);// socket server listens on port 4004
                System.out.println("Server is running");
                clientSocket = serverSocket.accept(); // accept() will wait until someone wants to connect in
                try {
                    /*after establishing the connection and recreating the socket for communication
                    with the client, we can proceed to the creation of I/o streams*/
                    // now we can receive messages
                    in = new BufferedReader(new InputStreamReader(clientSocket.getInputStream()));
                    // and send
                    out = new BufferedWriter(new OutputStreamWriter(clientSocket.getOutputStream()));
                    while (true) {
                        String word = in.readLine();  // wait until client write something to us
                        System.out.println(word);
                        // server responds to thr Client
                        out.write("Hello, this is a server ! Confirm that you have sent me following message: " + word + "\n");
                        out.flush();
                    }
                } finally { // in ane case socket will be closed
                    System.out.println("close");
                    clientSocket.close();
                    in.close();
                    out.close();
                }
            } finally {
                System.out.println("Server closed");
                serverSocket.close();
            }
        } catch (IOException e) {
            System.err.println(e);
        }
    }
}
