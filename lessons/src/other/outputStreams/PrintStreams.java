package other.outputStreams;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintStream;

public class PrintStreams {
    public static void main(String[] args) {
        String text = " Lenovo is the worse laptop in the world";
        try {
            FileOutputStream fos = new FileOutputStream("C:\\игорь\\ fos.txt");
            PrintStream printStream = new PrintStream(fos);
            printStream.println(text);
            System.out.println("The recording to the file is complete");
        } catch (IOException e){
            System.out.println(e.getMessage());
        }
    }
}
