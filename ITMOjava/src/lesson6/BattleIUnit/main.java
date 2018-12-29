package lesson6.BattleIUnit;

import java.util.Scanner;

public class main {
    public static void main(String[] args) {
       // BattleUn battleUn = new BattleUn(90,20);
        Knight knight = new Knight(100, 22);
        Spearmen spearma = new Spearmen(233, 10);
        knight.attack(spearma);
        Doctor doctor = new Doctor(90, 10);

        doctor.attack(knight);

        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите название персонажа");
        String userChoise = scanner.nextLine();

        BattleUnitFactoty unitFactoty = new BattleUnitFactoty();
        BattleUn unit = unitFactoty.create(userChoise);
//        BattleUn unit;
//        if (userChoise.equals("knight")){
//            unit = new Knight(100, 22);
//        } else if (userChoise.equals("spearmen")){
//            unit = new Spearmen(233, 10);
//        } else {
//            unit = new Doctor(90,10);
//        }

        Fight fight = new Fight(knight, spearma);
        fight.fight();
        System.out.println(fight.fightResult());


    }
}

 // Парадигмы ООП:
// Абстракция
// Инкапсуляция
// Полиформизм  создаем объект через общий родительский , или когда создаем одинаковые методы, но с разными аргументами
// Наследоавние
// Полиморфизм
// Повторное использование