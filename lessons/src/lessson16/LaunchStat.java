package lessson16;

import javax.xml.crypto.Data;
import java.io.*;
import java.util.Date;

public class LaunchStat implements Serializable {
    private int launchCount;
    private Date lastLaunch;

    private String lastUser;

    public void update() {
        launchCount++;
        lastLaunch = new Date();
        lastUser = System.getProperty("user.name");
    }

    public boolean isFirstLaunch() {
        return launchCount == 0 && lastLaunch == null;
    }

    @Override
    public String toString() {
        return "LaunchStat{" +
                "launchCount=" + launchCount +
                ", lastLaunch=" + lastLaunch +
                ", lastUser='" + lastUser + '\'' +
                '}';
    }

    public static void main(String[] args) throws IOException, ClassNotFoundException {
        File statFile = new File("stat.bin");
        LaunchStat stat; // Если это первый запуск, то необходимо создать stat.
        if (!statFile.exists()) {
            stat = new LaunchStat();
        } else {
            // А если повторный, то читаем с диска.

            try (ObjectInputStream objIn = new ObjectInputStream(new FileInputStream(statFile))) {
                stat = (LaunchStat) objIn.readObject();
            }
        }
        if (stat.isFirstLaunch()) {
            System.out.println("It's a first launch!");
        } else {
            System.out.println(stat); // Обновляем статистику.
        }
        stat.update();
        // Сохраняем на диск
        try (ObjectOutputStream objOut = new ObjectOutputStream(new FileOutputStream(statFile))) {
            objOut.writeObject(stat);
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
