package other.inputSteams;

import java.io.*;
import java.nio.charset.StandardCharsets;
import java.util.Properties;

public class FileInputStreamsUTF {
    public static void main(String[] args) {
        try {
            InputStream is = new FileInputStream("C:\\игорь\\123.txt");
            if (is != null) {
                Reader reader = new InputStreamReader(is, StandardCharsets.UTF_8);
                Properties props = new Properties();
                props.load(reader);
                System.out.println(props.getProperty("company") + ", " + props.getProperty("manager"));
                is.close();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
