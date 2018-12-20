package patterns.homework.task1_Decorator;

import java.io.*;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("Enter path of source file which you want to ENCODE OR write Exit");
            String sourcePath = scanner.nextLine();
            if (sourcePath.equals("Exit")) {
                return;
            }
            System.out.println("Enter password (key) to encode");
            String password = scanner.nextLine();
            byte[] passwordArray = password.getBytes();
            System.out.println("Enter path of destination file in which you want to save encoded text");
            String destPath = scanner.nextLine();

            try (InputStream in = new CryptoInputStream(new FileInputStream(sourcePath), passwordArray);
                 OutputStream out = new CryptoOutputStream(new FileOutputStream(destPath), passwordArray)
            ) {
                byte[] buff = new byte[in.available()];
                while (in.read(buff) > 0) {
                    out.write(buff);
                }
                System.out.println("FINISH");

            } catch (IOException e) {
                e.printStackTrace();
            }

            System.out.println("Enter path of source file which you want to decode OR write Exit");
            String sourcePath1 = scanner.nextLine();
            if (sourcePath1.equals("Exit")) {
                return;
            }
            System.out.println("Enter password (key) to DECODE");
            String password1 = scanner.nextLine();
            byte[] passwordArray1 = password1.getBytes();
            System.out.println("Enter path of destination file in which you want to save decoded text");
            String destPath1 = scanner.nextLine();

            try (InputStream in = new CryptoInputStream(new FileInputStream(sourcePath1), passwordArray1);
                 OutputStream out = new CryptoOutputStream(new FileOutputStream(destPath1), passwordArray1)
            ) {
                byte[] buff = new byte[in.available()];
                while (in.read(buff) > 0) {
                    out.write(buff);
                }
                System.out.println("FINISH");

            } catch (IOException e) {
                e.printStackTrace();
            }
        }

//        String path = "D:\\two.txt";
//        String pass = "qwerty";
//        byte[] passArr = pass.getBytes();
//        String str = null;
//
//        try (InputStream in = new CryptoInputStream(new FileInputStream(path), passArr)) {
//            while (in.available() > 0) {
//                System.out.print((char) in.read());
//            }
//        } catch (IOException e) {
//            e.printStackTrace();
//        }
    }
}


