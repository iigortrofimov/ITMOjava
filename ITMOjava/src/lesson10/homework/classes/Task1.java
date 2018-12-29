package lesson10.homework.classes;

import java.io.IOException;
import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) throws IOException {

        Scanner scanner = new Scanner(System.in);
        String s = null;

        while (true) {
            try {
                s = scanner.nextLine();
                if (s.equals("exit")) {
                    break;
                } else if (s.contains(".")) {
                    print(Double.parseDouble(s));
                } else if (Integer.parseInt(s) > 0 && Integer.parseInt(s) < 128) {
                    print(Short.parseShort(s));
                } else if (Integer.parseInt(s) <= 0 || Integer.parseInt(s) >= 128) {
                    print(Integer.parseInt(s));
                }
            }catch (NumberFormatException e){
                print(s);
            }
        }
    }

    static public void print(Double d){
        System.out.println(d);
    }
    static public void print (Short d){
        System.out.println(d);
    }
    static public void print (Integer d){
        System.out.println(d);
    }
    static public void print (String d) {
        System.out.println(d);
    }
}

