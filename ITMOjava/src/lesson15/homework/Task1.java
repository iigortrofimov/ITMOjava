package lesson15.homework;

import java.io.*;
import java.util.Scanner;

public class Task1 {
    private static void copyFile(File source, File dest) {
        try (InputStream in = new FileInputStream(source); OutputStream out = new FileOutputStream(dest)) {
            byte[] buffer = new byte[1024];
            int count = 0;
            while (in.available() > 0) {
                int data = in.read();
                out.write(data);
//              System.out.println(data);
                count++;
            }
//            int len;
//            while ((len = in.read(buffer)) > 0) {
//                out.write(buffer, 0, len);
//                count++;
//            }
            System.out.println("Count of copied bytes: " + count);
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }

    }

    public static void main(String[] args) {
        System.out.println("Enter file address, which you want to copy");
        Scanner scanner = new Scanner(System.in);
        String pathnameSource = scanner.nextLine();
        System.out.println("Enter file address, in which you want to copy in");
        String pathnameDest = scanner.nextLine();
        File file1 = new File(pathnameSource);
        File file2 = new File(pathnameDest);
        copyFile(file1, file2);
    }
}