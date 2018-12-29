package patterns.factory;

import com.sun.xml.internal.ws.handler.HandlerException;

abstract class Handler {
    abstract void read();

    abstract void write();

}

class TxtHandler extends Handler {
    @Override
    void read() {
        System.out.println("Read from Txt");
    }

    @Override
    void write() {
        System.out.println("Write in Txt");

    }
}

class XmlHandler extends Handler {
    @Override
    void read() {
        System.out.println("Read from Xml");
    }

    @Override
    void write() {
        System.out.println("Write in Xml");

    }
}

public class Factory {
    public Handler getHandler(String str) {
        Handler handler = null;
        if (str.endsWith("txt")) {
            handler = new TxtHandler();
        } else if (str.endsWith("xml")) {
            handler = new XmlHandler();
        }
        return handler;
    }

    public static void main(String[] args) {
        Factory factory = new Factory();
        String file = "qwe.txt";
        Handler h = factory.getHandler(file);
        h.read();
        h.write();
    }
}
