package chat;

import lesson16.printApp.Message;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.Socket;
import java.net.SocketAddress;

public class IOConnection {
    private Socket socket;
    private ObjectInputStream in;
    private ObjectOutputStream out;

    public IOConnection(Socket socket) {
        this.socket = socket;

        try {
            this.out = new ObjectOutputStream(socket.getOutputStream());
            this.in = new ObjectInputStream(socket.getInputStream());

        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }

    public void send (Message message){
        try{
            out.writeObject(message);
            out.flush();
        } catch (IOException e){
            System.out.println(e.getMessage());
        }
    }

    public Message recieve (){
        Message message = null;
        try{
            message = (Message)in.readObject();
        } catch (IOException | ClassNotFoundException e){
            System.out.println(e.getMessage());
        } return message;
    }

    public SocketAddress getRemoteSocketAddress(){
        return socket.getRemoteSocketAddress();
    }
}
