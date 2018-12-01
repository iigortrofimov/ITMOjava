package lesson15.homework;

import java.io.*;
import java.net.SocketAddress;
import java.util.Arrays;
import java.util.Scanner;

public class Task2 {

    private static void splitFile(File file1, File file2, File file3, int size) {
        try {
            InputStream in = new FileInputStream(file1);
            OutputStream out = new FileOutputStream(file2);
            OutputStream out2 = new FileOutputStream(file3);
            while (in.available() > 0) {
                int data = in.read();
                if (in.available() < size) {
                    out.write(data);
                } else out2.write(data);
            }
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter file address, which you want to split into two different files");
        String pathfile1 = scanner.nextLine();
        System.out.println("Enter file address, where we split your file");
        String pathfile2 = scanner.nextLine();
        System.out.println("Enter file address, where we split your file");
        String pathfile3 = scanner.nextLine();
        System.out.println("Enter size of the split");
        int size = scanner.nextInt();
        File file1 = new File(pathfile1);
        File file2 = new File(pathfile2);
        File file3 = new File(pathfile3);
        splitFile(file1, file2, file3, size);
    }
}
