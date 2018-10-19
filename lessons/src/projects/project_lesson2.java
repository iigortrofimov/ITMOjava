package projects;

import java.util.Scanner;

public class project_lesson2 {
    public static void main(String[] args) {
////        Scanner in = new Scanner(System.in);
////        System.out.println("Введите код. Трехзначное число");
////        int code = in.nextInt();
////        if (code == 123)
////        {
////            System.out.println("Вы вошли как администратор");
////        }
////        else  if (code == 321)
////        {
////            System.out.println("Вы вошли как участник");
////        }
////        else
////        {
////            System.out.println("Вы не вошли");
////        }
////
////
////        int a = 5, b = 7;
////        if (a == 5 && b == 7)
////        {
////            System.out.println("Совпадение найдено: a и b");
////        }
////        else if (b == 7)
////        {
////            System.out.println("Совпадение найдно: b");
////        }
////        else System.out.println("Совпадение не найденно");
////        так же есть вложенный if
//
////        __________________switch (оператор выбора)______________
//
////        большой приз 333333
////        средний 333334 333335
////        малый приз 333334 333335 333336
////        Scanner in2 = new Scanner(System.in);
////        System.out.println("Введите 6 значный номер билета");
////        int userTicketnum = in2.nextInt();
////        String prize;
////        switch (userTicketnum)
////        {
////            case 333333:
////                prize = "Большой приз";
////                break;
////            case 333334:
////            case 333335:
////                prize = "средний приз";
////                break;
////            case 333344:
////            case 333355:
////            case 333336:
////                prize = "малый приз";
////                break;
////                default:
////                    prize = "Приза нет";
////                    break;}
////                    System.out.println("Результат: " + prize);
//
//
//
////        ______________________WHILE_____________________
//
//        int messageCount = 5;
//        while (messageCount > 0 )
//        {
//            System.out.println("Сообщение № " + messageCount);
//            messageCount--;
//        }
//
////        =========================
//
//        Scanner in3;
//        System.out.println("Введите код. Трехзначное число");
//        int code2;
//        while (true)
//        {
//            in3 = new Scanner(System.in);
//            code2 = in3.nextInt();
//            if (code2 == 123)
//            {
//                System.out.println("администратор");
////                in3.close();  иногда надо закрывать! для экономии памяти!!!!
//            }
//                else if (code2 == 321)
//                {
//                    System.out.println("гость");
//                }
//                else
//                System.out.println("Повторите попытку");
//            }
//
////            ---------------------------Do While--------------
//
//        do {
////            System.out.println("Первая итерация");
//        } while (false); // в начале выполнит потом проверит условие

//        ==========================================for==============
//        for (инициализация; проверка_условия; шаг) {тело цикла}

//        for (int i = 0; i < 11; i++)
//        {
//            if (i % 2 == 0)
//            System.out.println("i = " + i);
//        }
//        for (int i = 0; i < 11; i++) {
//            if (i % 2 == 0) continue; // на четных операцию прекращает
//            System.out.println("i = " + i);
//        }
//        for (int i =0; i < 3; i++)
//        {
//            System.out.println("Внешний цикл. i = " + i);
//            for (int j = 0; j < 15; j++)
//            {
//                System.out.println("j = " + j);
//                if (j == 5) break;
//            }
//        }
        outer: for (int i =0; i < 3; i++)
        {
            System.out.println("Внешний цикл. i = " + i);
            for (int j = 0; j < 15; j++)
            {
                System.out.println("j = " + j);
                if (j == 5) break outer;
            }
        }



        }


}
