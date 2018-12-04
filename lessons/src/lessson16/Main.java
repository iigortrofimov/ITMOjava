package lessson16;

import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException, ClassNotFoundException, NotSerializableException {
        File file = new File("stat.bin");

        LaunchStatExternalizable stat;

        if (!file.exists()) {
            stat = new LaunchStatExternalizable();
        } else {
            try (ObjectInputStream objIn =
                         new ObjectInputStream(new FileInputStream(file))) {
                stat = (LaunchStatExternalizable) objIn.readObject();
            }
        }
        if (stat.isFirstLaunch()) {
            System.out.println("First Launch");
        } else {
            System.out.println(stat.toString());
        }

        stat.update();

        // saving
        try (ObjectOutputStream objectOutputStream =
                     new ObjectOutputStream(new FileOutputStream(file))) {
            objectOutputStream.writeObject(stat);
        }
    }
}
