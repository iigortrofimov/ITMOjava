package other.inputSteams;

import java.io.*;

public class InToOut {
    public static void main(String[] args) {
        try {
            InputStream in = new FileInputStream("C:\\игорь\\notempty.txt");
            OutputStream out = new FileOutputStream("C:\\игорь\\empty2.txt");
            byte[] buffer = new byte[in.available()];
            in.read(buffer, 0, buffer.length);
            out.write(buffer, 0, buffer.length);
            in.close();
            out.close();
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }
}