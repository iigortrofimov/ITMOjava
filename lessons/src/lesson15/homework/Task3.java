package lesson15.homework;

import java.io.*;
import java.util.Arrays;

//не получается дешифровать из файла в файл

public class Task3 {
    private static byte[] encode(String txt, String key) {
        byte[] bTxt = null;
        byte[] bKey = null;
        bTxt = txt.getBytes();
        bKey = key.getBytes();
        byte[] result = new byte[txt.length()];

        for (int i = 0; i < txt.length(); i++) {
            result[i] = (byte) (bTxt[i] ^ bKey[i % bKey.length]);
        }
        return result;
    }

    private static String decode(byte[] bTxt, String key) throws UnsupportedEncodingException {
        byte[] result = new byte[bTxt.length];
        byte[] bKey = key.getBytes();

        for (int i = 0; i < bTxt.length; i++) {
            result[i] = (byte) (bTxt[i] ^ bKey[i % bKey.length]);
        }
        return new String(result, "UTF-8");
    }

    private static void encodeFile(File file, File file2) {
        try {
            InputStream in = new FileInputStream(file);
            OutputStream out = new FileOutputStream(file2);
            byte[] buffer = new byte[in.available()];
            in.read(buffer, 0, buffer.length);
            String key = "abc";
            String secret = new String(buffer, "UTF-8");
            out.write(encode(secret, key));
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }

    private static void decodeFile(File file, File file2) {
        try {
            InputStream in = new FileInputStream(file);
            OutputStream out = new FileOutputStream(file2);
            byte[] buffer = new byte[in.available()];
            in.read(buffer, 0, buffer.length);
            String key = "qwerty";
            out.write(decode(buffer, key).getBytes());
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }

    public static void main(String[] args) {
//        File file = new File("c:\\java\\1.txt");
//        File file2 = new File("c:\\java\\2.txt");
//        File file3 = new File("c:\\java\\3.txt");
//        encodeFile(file, file2);
//        decodeFile(file2, file3);

        String secret = " I live in SPb all my life";
        String key = "abc";
        byte[] b = encode(secret, key);
        String str = null;
        try {
            str = new String(encode(secret, key), "UTF-8");
            System.out.println(str);
            System.out.println(decode(b, key));
        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
        }
    }

}
