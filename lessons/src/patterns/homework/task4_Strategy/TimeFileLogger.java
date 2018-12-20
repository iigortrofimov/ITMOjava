package patterns.homework.task4_Strategy;

import java.io.*;
import java.nio.charset.Charset;
import java.util.Date;

public class TimeFileLogger implements ILogger {
    private Date date = new Date();

    @Override
    public void write(String info) {
        info = info + " : " + date;
        byte[] buffer = info.getBytes(Charset.defaultCharset());
        File file = new File("D:\\5.txt");
        try (OutputStream out = new FileOutputStream(file, true)) {
            out.write(buffer);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
    /**
            info += " : " + date.toString();
            FileLogger fileLogger = new FileLogger();
            fileLogger.write(info);
    */
