package other.tests.chat;

import java.io.*;
import java.net.Socket;

public class ChatClient {
    private static Socket clientSocket; // socket for communication
    private static BufferedReader reader; // Reader for reading from console for client message;
    private static BufferedReader in; // Reading stream from socket;
    private static BufferedWriter out; // Writing stream i

    public static void main(String[] args) {
        try {
            try {
                // port similar as server
                clientSocket = new Socket("localhost", 4004); // ask the server for connection access
                reader = new BufferedReader(new InputStreamReader(System.in));
                // reading messages from server
                in = new BufferedReader(new InputStreamReader(clientSocket.getInputStream()));
                // write mes to server
                out = new BufferedWriter(new OutputStreamWriter(clientSocket.getOutputStream()));
                while (true) {
                    System.out.println(" Write the message ");
                    String word = reader.readLine(); // wait until client write something
                    if (word.equals("exit")) {
                        return;
                    }
                    out.write(word + "\n"); // send mes to server
                    out.flush();
                    String serverWord = in.readLine();// wait for server replying
                    System.out.println(serverWord);
                }
            } finally { // close sockets ans streams
                System.out.println("Client closed");
                clientSocket.close();
                in.close();
                out.close();
            }
        } catch (IOException e) {
            System.err.println(e);
        }
    }
}
