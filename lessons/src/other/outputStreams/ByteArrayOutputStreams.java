package other.outputStreams;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.util.Arrays;

public class ByteArrayOutputStreams {
    public static void main(String[] args) {
        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        String text = "AB AB CD CD OE oE";
        byte[] buffer = text.getBytes();
        try {
            baos.write(buffer);
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
        System.out.println(baos.toString());
        byte[] array = baos.toByteArray();

        System.out.println("----------------------");
        //System.out.println(Arrays.toString(buffer) + "  |  " + Arrays.toString(array));
        for (byte b : buffer) {
            System.out.print(b + ", ");
        }
        System.out.println("\n" + "---------------------");
        for (byte c : array) {
            System.out.print((char) c + ", ");
        }

    }
}