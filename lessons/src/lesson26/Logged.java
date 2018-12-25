package lesson26;

import java.io.IOException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Date;
import java.util.logging.*;

public class Logged {
    // create Logger

    private static final Logger LOGGER = Logger.getLogger(Logged.class.getName());

    static {
        // setting the Logging level
        LOGGER.setLevel(Level.INFO);
    }

    public static void main(String[] args) {
        LOGGER.info("Started with args: " + Arrays.toString(args));

        try {
            int result = 3 / 0;
        } catch (Exception e) {
            LOGGER.severe("Fatal error: " + e.getMessage());
        }
    }
}

class LoggerFile {
    // create
    private static final Logger LOGGER = Logger.getLogger(LoggerFile.class.getName());

    static {
        try {
            LOGGER.addHandler(new FileHandler("logged.log.xml"));

            FileHandler fileHandler = new FileHandler("logged.log");
            fileHandler.setFormatter(new MyFormatter()); // форматирование данных

            LOGGER.addHandler(fileHandler);
        } catch (IOException e) {
            LOGGER.warning("Failed to create file");
        }
    }

    public static void main(String[] args) {
        LOGGER.info("Started with args: " + Arrays.toString(args));

        try {
            int result = 3 / 0;
        } catch (Exception e) {
            LOGGER.severe("Fatal error: " + e.getMessage());
        }
    }
}

class MyFormatter extends Formatter {

    private final static ThreadLocal<DateFormat> DATE_FORMAT = new ThreadLocal<DateFormat>() {
        @Override
        protected DateFormat initialValue() {
            return new SimpleDateFormat("yyyy-MM-dd HH:mm");
        }
    };

    @Override
    public String format(LogRecord record) {
        // свой формат записи в файл
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("[").append(formatTime(record.getMillis())).append("]");
        stringBuilder.append("[").append(record.getLevel()).append("]");
        stringBuilder.append(record.getMessage());
        return stringBuilder.toString();
    }

    private String formatTime(long mls) {
        return DATE_FORMAT.get().format(new Date(mls));
    }
}
