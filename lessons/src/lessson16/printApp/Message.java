package lessson16.printApp;

import java.io.Serializable;

public class Message implements Serializable {
    private String messText;
    private String sendler;

    public Message(String sendler, String messText){
        this.sendler = sendler;
        this.messText = messText;
    }

    public String getMessText() {
        return messText;
    }

    public void setMessText(String messText) {
        this.messText = messText;
    }

    public String getSendler() {
        return sendler;
    }

    public void setSendler(String sendler) {
        this.sendler = sendler;
    }
}
