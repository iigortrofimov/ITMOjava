package other.inputSteams;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.util.Arrays;

public class FileOutputStreams {
    public static void main(String[] args) {
        String str = "Hello my dear friend, how are you, i really miss you?";
        try {
            OutputStream outputStream =
                    new FileOutputStream("C:\\игорь\\empty.txt");
            byte[] buffer = str.getBytes();
            System.out.println(Arrays.toString(buffer));
            outputStream.write(buffer, 0, buffer.length);
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }
}
