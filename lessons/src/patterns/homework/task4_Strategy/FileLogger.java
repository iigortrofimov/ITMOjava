package patterns.homework.task4_Strategy;

import java.io.*;

public class FileLogger implements ILogger {
    @Override
    public void write(String info) {
        File file = new File("D:\\3.txt");
        byte[] buffer = info.getBytes();
        try (OutputStream out = new FileOutputStream(file)) {
            for (byte b : buffer) {
                out.write(b);
            }
            out.write(buffer);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

    /**  public void write(String info) {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter("D:\\4.txt", true))) {
            writer.write(info);
            writer.newLine();
        } catch (IOException e) {
            e.printStackTrace();
    }*/