package lesson26;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.Arrays;

public class Log4LoggedProgram {
    // private static final Logger LOGGER = Logger.getLogger(Log4LoggedProgram.class.getName());

//    public static void main(String[] args) {
//        LOGGER.info("Started with args: " + Arrays.toString(args));
//
//        try {
//            int result = 3 / 0;
//        } catch (Exception e) {
//            LOGGER.error("Fatal error: " + e.getMessage());
//        }
//    }
//}
}

class SLF4 {
    private static final Logger LOGGER = LoggerFactory.getLogger(SLF4.class);

    public static void main(String[] args) {
        LOGGER.info("Started with args: " + Arrays.toString(args));

        try {
            int result = 3 / 0;
        } catch (Exception e) {
            LOGGER.error("Fatal error: " + e.getMessage());
        }
    }
}