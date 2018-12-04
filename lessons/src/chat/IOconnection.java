package chat;

import lessson16.printApp.Message;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.Socket;
import java.net.SocketAddress;

public class IOconnection {
    Socket socket;
    ObjectInputStream in;
    ObjectOutputStream out;

    public IOconnection(Socket socket) {
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
