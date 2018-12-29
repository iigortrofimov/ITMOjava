package other.inputSteams;

import java.io.FileInputStream;
import java.io.IOException;

public class FileInputStreams {
    public static void main(String[] args) {
        try {
            FileInputStream fileInputStream =
                    new FileInputStream("C:\\игорь\\123.txt");
            System.out.println("File size: " + fileInputStream.available() + " bytes");
//            int i = -1;
//            while ((i = fileInputStream.read()) != -1) {
//                System.out.print((char) i);
//            }
            byte[] buffer = new byte[fileInputStream.available()];
            fileInputStream.read(buffer, 0, fileInputStream.available());
            System.out.println("___________________________________________");

            System.out.println("Содержимое файла: ");
            for (byte aBuffer : buffer) {
                System.out.print((char) aBuffer);
            }
            fileInputStream.close();
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }


    }
}

